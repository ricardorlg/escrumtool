package co.edu.unal.avanzada.software.client.homepresenter;

import javax.inject.Inject;

import com.bramosystems.oss.player.core.client.AbstractMediaPlayer;
import com.bramosystems.oss.player.core.client.PlayerInfo;
import com.bramosystems.oss.player.core.client.PlayerUtil;
import com.bramosystems.oss.player.core.client.PluginNotFoundException;
import com.bramosystems.oss.player.core.client.PluginVersionException;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

public class HomePresenterView extends ViewImpl implements
		HomePresenterPresenter.MyView {
	interface Binder extends UiBinder<Widget, HomePresenterView> {
	}

	@UiField
	public SimplePanel mainPanel;
	public Widget widget;
	public AbstractMediaPlayer player;

	@Inject
	public HomePresenterView(Binder uiBinder) {
		widget = uiBinder.createAndBindUi(this);
		try {
			// retrieve the basic information about the YouTubeIPlayer as
			// registered with the API
			// using the provider name and the player name
			PlayerInfo pi = PlayerUtil.getPlayerInfo("bst.youtube", "YouTube");

			// create the player, using the PlayerInfo object and specifing URL
			// of media
			player = PlayerUtil.getPlayer(pi, "XU0llRltyFM", true, "100%",
					"100%");
			mainPanel.setWidget(player); // add player to panel.

		} catch (PluginVersionException e) {
			// required plugin version is not available, alert user
			mainPanel.setWidget(PlayerUtil.getMissingPluginNotice(
					e.getPlugin(), e.getRequiredVersion()));
		} catch (PluginNotFoundException e) {
			// catch PluginNotFoundException and display a friendly notice.
			mainPanel
					.setWidget(PlayerUtil.getMissingPluginNotice(e.getPlugin()));
		}
	}

	@Override
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return widget;
	}

	@Override
	public void setInSlot(Object slot, IsWidget content) {
		if (slot == HomePresenterPresenter.SLOT_HomePresenter) {
			mainPanel.setWidget(content);
		} else {
			super.setInSlot(slot, content);
		}
	}
}
