package com.broadcast.view.base;

import java.awt.Toolkit;

import org.apache.commons.beanutils.PropertyUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Widget;

public abstract class IMainView {

	public static Shell shell;
	
	public static Display display;

	public abstract void createShell();

	public abstract void createContents();

	public abstract String getApplicationXml();

	/**
	 * 视图操作对象
	 * 
	 * @author zoro
	 *
	 */
	public static class View {

		public static void addView(IBaseView baseView) {
			baseView.createContents(shell);
			baseView.createListenter();
			baseView.preHandle();
		}

		public static void addView(Composite composite, IBaseView baseView) {
			baseView.preHandle();
			baseView.createContents(shell);
			baseView.createContents(composite);
			baseView.createListenter();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * 显示位置
	 */
	protected void showPosition() {
		shell.setLocation(
				((Toolkit.getDefaultToolkit().getScreenSize().width - shell
						.getBounds().width) / 2),
				((Toolkit.getDefaultToolkit().getScreenSize().height - 35 - shell
						.getBounds().height) / 2));
	}

	protected void load() {
		createShell();
		createContents();
		showPosition();
		open();
	}

	/**
	 * 消息工具类
	 * 
	 * @author zoro
	 *
	 */
	public static class MessageBox2 {

		/**
		 * 确认对话框
		 * 
		 * @param msg
		 * @return
		 */
		public static boolean isOk(String msg) {
			if (msg == null) {
				return false;
			}
			MessageBox messageBox = new MessageBox(shell, SWT.OK | SWT.CANCEL);
			messageBox.setMessage(msg);
			if (messageBox.open() == SWT.OK) {
				return true;
			}
			return false;
		}

		/**
		 * 弹出错误消息
		 * 
		 * @param msg
		 */
		public static void showErrorMsg(final String msg, final Exception e) {
			if (msg == null) {
				return;
			}
			Display.getDefault().syncExec(new Runnable() {
				public void run() {
					MessageBox messageBox = new MessageBox(shell, SWT.OK
							| SWT.ICON_ERROR);
					messageBox.setMessage(msg
							+ (e != null ? e.getMessage() : ""));
					messageBox.open();
				}
			});
		}

		/**
		 * 弹出错误消息
		 * 
		 * @param msg
		 */
		public static void showErrorMsg(String msg) {
			showErrorMsg(msg, null);
		}
	}

	/**
	 * 异步操作window frame 对象
	 * 
	 * @author zoro
	 *
	 */
	public static class JFrame {

		private static String jFrameValue;

		public static String getText(final Widget widget) {
			Display.getDefault().syncExec(new Runnable() {
				public void run() {
					try {
						jFrameValue = (String) PropertyUtils.getProperty(
								widget, "text");
					} catch (Exception e) {
						jFrameValue = null;
					}
				}
			});
			return jFrameValue;
		}

		public static void setEditable(final Control control,
				final Boolean editable) {
			Display.getDefault().syncExec(new Runnable() {
				public void run() {
					control.setEnabled(editable);
				}
			});
		}
	}

}
