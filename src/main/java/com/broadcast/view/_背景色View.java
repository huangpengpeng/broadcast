package com.broadcast.view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

import com.broadcast.view.base.IBaseView;

public class _背景色View implements IBaseView {
	
	public static _背景色View _背景色View=new _背景色View();

	private CLabel lblNewLabel;

	public void createContents(Shell shell) {
		lblNewLabel = new CLabel(shell, SWT.NONE);
		lblNewLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblNewLabel.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setBounds(0, 0, 892, 18);
		lblNewLabel.setText("实现全屏效果，请将操作系统背景色修改为 170 , 0 , 1 (此RGB颜色默认取图片左上角第一个像素点颜色值)");
	}

	public void createContents(Composite composite) {
	}

	public void createListenter() {
		// TODO Auto-generated method stub

	}

	public void preHandle() {
		// TODO Auto-generated method stub

	}

	public void fullContents(Object... values) {
		RGB rgb = (RGB) values[0];
		if (rgb != null) {
			lblNewLabel.setText("实现全屏效果，请将操作系统背景色修改为 " + rgb.red + " , "
					+ rgb.blue + " , " + rgb.green + " (此RGB颜色默认取图片左上角第一个像素点颜色值)");
		}
	}

}
