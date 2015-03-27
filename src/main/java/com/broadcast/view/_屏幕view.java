package com.broadcast.view;

import static com.broadcast.view.base.IMainView.shell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.ResourceUtils;
import org.eclipse.wb.swt.SWTResourceManager;

import com.broadcast.cache.CacheUtils;
import com.broadcast.cache.model.OrderModel;
import com.broadcast.cache.model._屏幕Model;
import com.broadcast.cache.model._排名Model;

public class _屏幕view extends Dialog {

	protected Object result;
	public Shell dialogshell;

	public static _屏幕view _屏幕view = new _屏幕view(shell, SWT.NO_TRIM);

	/**
	 * Create the dialog.
	 * 
	 * @param parent
	 * @param style
	 */
	public _屏幕view(Shell parent, int style) {
		super(parent, style);
		setText("屏幕");
	}

	public void close() {
		dialogshell.close();
	}

	/**
	 * Open the dialog.
	 * 
	 * @return the result
	 */
	public Object open() {
		createContents();
		dialogshell.open();
		dialogshell.layout();
		P();
		D();
		Display display = getParent().getDisplay();
		while (!dialogshell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	private CLabel _第一名姓名;
	private CLabel _第一名数量;
	private CLabel _第二名姓名;
	private CLabel _第二名数量;
	private CLabel _第三名姓名;
	private CLabel _第三名数量;
	private CLabel _第四名姓名;
	private CLabel _第四名数量;
	private CLabel _第五名姓名;
	private CLabel _第五名数量;
	private CLabel _第六名姓名;
	private CLabel _第六名数量;
	private CLabel _第七名姓名;
	private CLabel _第七名数量;
	private CLabel _第八名姓名;
	private CLabel _第八名数量;
	private CLabel _第九名姓名;
	private CLabel _第九名数量;
	private CLabel _总数量;
	private CLabel _总人数;

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		dialogshell = new Shell(getParent(), getStyle());
		dialogshell.setSize(602, 398);
		dialogshell.setText(getText());

		_第一名姓名 = new CLabel(dialogshell, SWT.NONE);
		_第一名姓名.setBounds(22, 10, 91, 43);
		_第一名姓名.setText("");
		_第一名姓名.setAlignment(SWT.CENTER);

		_第一名数量 = new CLabel(dialogshell, SWT.NONE);
		_第一名数量.setText("");
		_第一名数量.setBounds(146, 10, 91, 43);
		_第一名数量.setAlignment(SWT.CENTER);

		_第二名姓名 = new CLabel(dialogshell, SWT.NONE);
		_第二名姓名.setText("");
		_第二名姓名.setBounds(32, 59, 91, 43);
		_第二名姓名.setAlignment(SWT.CENTER);

		_第二名数量 = new CLabel(dialogshell, SWT.NONE);
		_第二名数量.setText("");
		_第二名数量.setBounds(156, 59, 91, 43);
		_第二名数量.setAlignment(SWT.CENTER);

		_第三名姓名 = new CLabel(dialogshell, SWT.NONE);
		_第三名姓名.setText("");
		_第三名姓名.setBounds(22, 108, 91, 43);
		_第三名姓名.setAlignment(SWT.CENTER);

		_第三名数量 = new CLabel(dialogshell, SWT.NONE);
		_第三名数量.setText("");
		_第三名数量.setBounds(146, 108, 91, 43);
		_第三名数量.setAlignment(SWT.CENTER);

		_第四名姓名 = new CLabel(dialogshell, SWT.NONE);
		_第四名姓名.setText("");
		_第四名姓名.setBounds(22, 152, 91, 43);
		_第四名姓名.setAlignment(SWT.CENTER);

		_第四名数量 = new CLabel(dialogshell, SWT.NONE);
		_第四名数量.setText("");
		_第四名数量.setBounds(146, 157, 91, 43);
		_第四名数量.setAlignment(SWT.CENTER);

		_第五名姓名 = new CLabel(dialogshell, SWT.NONE);
		_第五名姓名.setText("");
		_第五名姓名.setBounds(22, 216, 91, 43);
		_第五名姓名.setAlignment(SWT.CENTER);

		_第五名数量 = new CLabel(dialogshell, SWT.NONE);
		_第五名数量.setText("");
		_第五名数量.setBounds(146, 216, 91, 43);
		_第五名数量.setAlignment(SWT.CENTER);

		_第六名姓名 = new CLabel(dialogshell, SWT.NONE);
		_第六名姓名.setText("");
		_第六名姓名.setBounds(22, 265, 91, 43);
		_第六名姓名.setAlignment(SWT.CENTER);

		_第六名数量 = new CLabel(dialogshell, SWT.NONE);
		_第六名数量.setText("");
		_第六名数量.setBounds(146, 265, 91, 43);
		_第六名数量.setAlignment(SWT.CENTER);

		_第七名姓名 = new CLabel(dialogshell, SWT.NONE);
		_第七名姓名.setText("");
		_第七名姓名.setBounds(258, 10, 91, 43);
		_第七名姓名.setAlignment(SWT.CENTER);

		_第七名数量 = new CLabel(dialogshell, SWT.NONE);
		_第七名数量.setText("");
		_第七名数量.setBounds(253, 59, 91, 43);
		_第七名数量.setAlignment(SWT.CENTER);

		_第八名姓名 = new CLabel(dialogshell, SWT.NONE);
		_第八名姓名.setText("");
		_第八名姓名.setBounds(258, 108, 91, 43);
		_第八名姓名.setAlignment(SWT.CENTER);

		_第八名数量 = new CLabel(dialogshell, SWT.NONE);
		_第八名数量.setText("");
		_第八名数量.setBounds(365, 108, 91, 43);
		_第八名数量.setAlignment(SWT.CENTER);

		_第九名姓名 = new CLabel(dialogshell, SWT.NONE);
		_第九名姓名.setText("");
		_第九名姓名.setBounds(258, 171, 91, 43);
		_第九名姓名.setAlignment(SWT.CENTER);

		_第九名数量 = new CLabel(dialogshell, SWT.NONE);
		_第九名数量.setText("");
		_第九名数量.setBounds(365, 171, 91, 43);
		_第九名数量.setAlignment(SWT.CENTER);

		_总数量 = new CLabel(dialogshell, SWT.NONE);
		_总数量.setText("");
		_总数量.setBounds(268, 220, 91, 43);
		_总数量.setAlignment(SWT.CENTER);

		_总人数 = new CLabel(dialogshell, SWT.NONE);
		_总人数.setText("");
		_总人数.setBounds(368, 320, 91, 43);
		_总人数.setAlignment(SWT.CENTER);

		if (ResourceUtils.getImage() != null) {
			dialogshell.setBackgroundImage(ResourceUtils.getImage());
		}

		final MoveListener listener = new MoveListener(dialogshell);
		dialogshell.addListener(SWT.MouseDown, listener);
		dialogshell.addListener(SWT.MouseMove, listener);
	}

	public void D() {
		List<OrderModel> list = CacheUtils.get(CacheUtils._订单);
		if (list == null) {
			list = new ArrayList<OrderModel>();
		}
		Collections.sort(list, new Comparator() {
			public int compare(Object _o1, Object _o2) {
				OrderModel p1 = (OrderModel) _o1;
				OrderModel p2 = (OrderModel) _o2;
				if (p1.getQuantity().equals(p2.getQuantity())) {
					return p1.getCreateTime().compareTo(p2.getCreateTime());
				}
				return p2.getQuantity().compareTo(p1.getQuantity());
			}
		});
		if (list.size() >= 1) {
			_第一名姓名.setText(list.get(0).getName());
			_第一名数量.setText(list.get(0).getQuantity().toString());
		} else {
			_第一名姓名.setText("");
			_第一名数量.setText("");
		}

		if (list.size() >= 2) {
			_第二名姓名.setText(list.get(1).getName());
			_第二名数量.setText(list.get(1).getQuantity().toString());
		} else {
			_第二名姓名.setText("");
			_第二名数量.setText("");
		}

		if (list.size() >= 3) {
			_第三名姓名.setText(list.get(2).getName());
			_第三名数量.setText(list.get(2).getQuantity().toString());
		} else {
			_第三名姓名.setText("");
			_第三名数量.setText("");
		}

		if (list.size() >= 4) {
			_第四名姓名.setText(list.get(3).getName());
			_第四名数量.setText(list.get(3).getQuantity().toString());
		} else {
			_第四名姓名.setText("");
			_第四名数量.setText("");
		}

		if (list.size() >= 5) {
			_第五名姓名.setText(list.get(4).getName());
			_第五名数量.setText(list.get(4).getQuantity().toString());
		} else {
			_第五名姓名.setText("");
			_第五名数量.setText("");
		}

		if (list.size() >= 6) {
			_第六名姓名.setText(list.get(5).getName());
			_第六名数量.setText(list.get(5).getQuantity().toString());
		} else {
			_第六名姓名.setText("");
			_第六名数量.setText("");
		}

		if (list.size() >= 7) {
			_第七名姓名.setText(list.get(6).getName());
			_第七名数量.setText(list.get(6).getQuantity().toString());
		} else {
			_第七名姓名.setText("");
			_第七名数量.setText("");
		}

		if (list.size() >= 8) {
			_第八名姓名.setText(list.get(7).getName());
			_第八名数量.setText(list.get(7).getQuantity().toString());
		} else {
			_第八名姓名.setText("");
			_第八名数量.setText("");
		}

		if (list.size() >= 9) {
			_第九名姓名.setText(list.get(8).getName());
			_第九名数量.setText(list.get(8).getQuantity().toString());
		} else {
			_第九名姓名.setText("");
			_第九名数量.setText("");
		}

		long q = 0;
		for (OrderModel orderModel : list) {
			q = q + orderModel.getQuantity();
		}
		_总数量.setText(q == 0 ? "" : (q + ""));

		_总人数.setText(list.size() + "");
	}

	public void P() {
		Image image = ResourceUtils.getImage();

		if (image == null) {
			return;
		}

		_排名Model _排名Model = null;
		_屏幕Model _屏幕Model = CacheUtils.get(CacheUtils._屏幕);

		dialogshell.setBackgroundImage(image);

		if (_屏幕Model != null) {
			dialogshell.setSize(_屏幕Model.getWidth(), _屏幕Model.getHeidht());
		}

		RGB rgb = ResourceUtils.getImageGRB(image);
		_排名Model = CacheUtils.get(CacheUtils._第一名_姓名);
		org.eclipse.swt.graphics.Color fontColor = null, backcolor = null;
		if (_排名Model.getRgb().contains("|")) {
			String[] rgbs = _排名Model.getRgb().split("\\|");
			fontColor = ResourceUtils.getColor(rgbs[0]);
			backcolor = ResourceUtils.getColor(rgbs[1]);
		} else {
			fontColor = ResourceUtils.getColor(_排名Model.getRgb());
			backcolor = SWTResourceManager.getColor(rgb);
		}
		_第一名姓名.setLocation(_排名Model.getLeft(), _排名Model.getTop());
		_第一名姓名.setBackground(backcolor);
		_第一名姓名.setFont(SWTResourceManager.getFont("宋体", _排名Model.getFontSize(),
				_排名Model.getRgb().contains("#") ? SWT.BOLD : SWT.NORMAL));
		_第一名姓名.setForeground(fontColor);
		_第一名姓名.setSize(_排名Model.getWidth(), _排名Model.getHeight());

		_排名Model = CacheUtils.get(CacheUtils._第二名_姓名);
		if (_排名Model.getRgb().contains("|")) {
			String[] rgbs = _排名Model.getRgb().split("\\|");
			fontColor = ResourceUtils.getColor(rgbs[0]);
			backcolor = ResourceUtils.getColor(rgbs[1]);
		} else {
			fontColor = ResourceUtils.getColor(_排名Model.getRgb());
			backcolor = SWTResourceManager.getColor(rgb);
		}
		_第二名姓名.setLocation(_排名Model.getLeft(), _排名Model.getTop());
		_第二名姓名.setBackground(backcolor);
		_第二名姓名.setFont(SWTResourceManager.getFont("宋体", _排名Model.getFontSize(),
				_排名Model.getRgb().contains("#") ? SWT.BOLD : SWT.NORMAL));
		_第二名姓名.setForeground(fontColor);
		_第二名姓名.setSize(_排名Model.getWidth(), _排名Model.getHeight());

		_排名Model = CacheUtils.get(CacheUtils._第三名_姓名);
		if (_排名Model.getRgb().contains("|")) {
			String[] rgbs = _排名Model.getRgb().split("\\|");
			fontColor = ResourceUtils.getColor(rgbs[0]);
			backcolor = ResourceUtils.getColor(rgbs[1]);
		} else {
			fontColor = ResourceUtils.getColor(_排名Model.getRgb());
			backcolor = SWTResourceManager.getColor(rgb);
		}
		_第三名姓名.setLocation(_排名Model.getLeft(), _排名Model.getTop());
		_第三名姓名.setBackground(backcolor);
		_第三名姓名.setFont(SWTResourceManager.getFont("宋体", _排名Model.getFontSize(),
				_排名Model.getRgb().contains("#") ? SWT.BOLD : SWT.NORMAL));
		_第三名姓名.setForeground(fontColor);
		_第三名姓名.setSize(_排名Model.getWidth(), _排名Model.getHeight());

		_排名Model = CacheUtils.get(CacheUtils._第四名_姓名);
		if (_排名Model.getRgb().contains("|")) {
			String[] rgbs = _排名Model.getRgb().split("\\|");
			fontColor = ResourceUtils.getColor(rgbs[0]);
			backcolor = ResourceUtils.getColor(rgbs[1]);
		} else {
			fontColor = ResourceUtils.getColor(_排名Model.getRgb());
			backcolor = SWTResourceManager.getColor(rgb);
		}
		_第四名姓名.setLocation(_排名Model.getLeft(), _排名Model.getTop());
		_第四名姓名.setBackground(backcolor);
		_第四名姓名.setFont(SWTResourceManager.getFont("宋体", _排名Model.getFontSize(),
				_排名Model.getRgb().contains("#") ? SWT.BOLD : SWT.NORMAL));
		_第四名姓名.setForeground(fontColor);
		_第四名姓名.setSize(_排名Model.getWidth(), _排名Model.getHeight());

		_排名Model = CacheUtils.get(CacheUtils._第五名_姓名);
		if (_排名Model.getRgb().contains("|")) {
			String[] rgbs = _排名Model.getRgb().split("\\|");
			fontColor = ResourceUtils.getColor(rgbs[0]);
			backcolor = ResourceUtils.getColor(rgbs[1]);
		} else {
			fontColor = ResourceUtils.getColor(_排名Model.getRgb());
			backcolor = SWTResourceManager.getColor(rgb);
		}
		_第五名姓名.setLocation(_排名Model.getLeft(), _排名Model.getTop());
		_第五名姓名.setBackground(backcolor);
		_第五名姓名.setFont(SWTResourceManager.getFont("宋体", _排名Model.getFontSize(),
				_排名Model.getRgb().contains("#") ? SWT.BOLD : SWT.NORMAL));
		_第五名姓名.setForeground(fontColor);
		_第五名姓名.setSize(_排名Model.getWidth(), _排名Model.getHeight());

		_排名Model = CacheUtils.get(CacheUtils._第六名_姓名);
		if (_排名Model.getRgb().contains("|")) {
			String[] rgbs = _排名Model.getRgb().split("\\|");
			fontColor = ResourceUtils.getColor(rgbs[0]);
			backcolor = ResourceUtils.getColor(rgbs[1]);
		} else {
			fontColor = ResourceUtils.getColor(_排名Model.getRgb());
			backcolor = SWTResourceManager.getColor(rgb);
		}
		_第六名姓名.setLocation(_排名Model.getLeft(), _排名Model.getTop());
		_第六名姓名.setBackground(backcolor);
		_第六名姓名.setFont(SWTResourceManager.getFont("宋体", _排名Model.getFontSize(),
				_排名Model.getRgb().contains("#") ? SWT.BOLD : SWT.NORMAL));
		_第六名姓名.setForeground(fontColor);
		_第六名姓名.setSize(_排名Model.getWidth(), _排名Model.getHeight());

		_排名Model = CacheUtils.get(CacheUtils._第七名_姓名);
		if (_排名Model.getRgb().contains("|")) {
			String[] rgbs = _排名Model.getRgb().split("\\|");
			fontColor = ResourceUtils.getColor(rgbs[0]);
			backcolor = ResourceUtils.getColor(rgbs[1]);
		} else {
			fontColor = ResourceUtils.getColor(_排名Model.getRgb());
			backcolor = SWTResourceManager.getColor(rgb);
		}
		_第七名姓名.setLocation(_排名Model.getLeft(), _排名Model.getTop());
		_第七名姓名.setBackground(backcolor);
		_第七名姓名.setFont(SWTResourceManager.getFont("宋体", _排名Model.getFontSize(),
				_排名Model.getRgb().contains("#") ? SWT.BOLD : SWT.NORMAL));
		_第七名姓名.setForeground(fontColor);
		_第七名姓名.setSize(_排名Model.getWidth(), _排名Model.getHeight());

		_排名Model = CacheUtils.get(CacheUtils._第八名_姓名);
		if (_排名Model.getRgb().contains("|")) {
			String[] rgbs = _排名Model.getRgb().split("\\|");
			fontColor = ResourceUtils.getColor(rgbs[0]);
			backcolor = ResourceUtils.getColor(rgbs[1]);
		} else {
			fontColor = ResourceUtils.getColor(_排名Model.getRgb());
			backcolor = SWTResourceManager.getColor(rgb);
		}
		_第八名姓名.setLocation(_排名Model.getLeft(), _排名Model.getTop());
		_第八名姓名.setBackground(backcolor);
		_第八名姓名.setFont(SWTResourceManager.getFont("宋体", _排名Model.getFontSize(),
				_排名Model.getRgb().contains("#") ? SWT.BOLD : SWT.NORMAL));
		_第八名姓名.setForeground(fontColor);
		_第八名姓名.setSize(_排名Model.getWidth(), _排名Model.getHeight());

		_排名Model = CacheUtils.get(CacheUtils._第九名_姓名);
		if (_排名Model.getRgb().contains("|")) {
			String[] rgbs = _排名Model.getRgb().split("\\|");
			fontColor = ResourceUtils.getColor(rgbs[0]);
			backcolor = ResourceUtils.getColor(rgbs[1]);
		} else {
			fontColor = ResourceUtils.getColor(_排名Model.getRgb());
			backcolor = SWTResourceManager.getColor(rgb);
		}
		_第九名姓名.setLocation(_排名Model.getLeft(), _排名Model.getTop());
		_第九名姓名.setBackground(backcolor);
		_第九名姓名.setFont(SWTResourceManager.getFont("宋体", _排名Model.getFontSize(),
				_排名Model.getRgb().contains("#") ? SWT.BOLD : SWT.NORMAL));
		_第九名姓名.setForeground(fontColor);
		_第九名姓名.setSize(_排名Model.getWidth(), _排名Model.getHeight());

		_排名Model = CacheUtils.get(CacheUtils._第一名_数量);
		if (_排名Model.getRgb().contains("|")) {
			String[] rgbs = _排名Model.getRgb().split("\\|");
			fontColor = ResourceUtils.getColor(rgbs[0]);
			backcolor = ResourceUtils.getColor(rgbs[1]);
		} else {
			fontColor = ResourceUtils.getColor(_排名Model.getRgb());
			backcolor = SWTResourceManager.getColor(rgb);
		}
		_第一名数量.setLocation(_排名Model.getLeft(), _排名Model.getTop());
		_第一名数量.setBackground(backcolor);
		_第一名数量.setFont(SWTResourceManager.getFont("宋体", _排名Model.getFontSize(),
				_排名Model.getRgb().contains("#") ? SWT.BOLD : SWT.NORMAL));
		_第一名数量.setForeground(fontColor);
		_第一名数量.setSize(_排名Model.getWidth(), _排名Model.getHeight());

		_排名Model = CacheUtils.get(CacheUtils._第二名_数量);
		if (_排名Model.getRgb().contains("|")) {
			String[] rgbs = _排名Model.getRgb().split("\\|");
			fontColor = ResourceUtils.getColor(rgbs[0]);
			backcolor = ResourceUtils.getColor(rgbs[1]);
		} else {
			fontColor = ResourceUtils.getColor(_排名Model.getRgb());
			backcolor = SWTResourceManager.getColor(rgb);
		}
		_第二名数量.setLocation(_排名Model.getLeft(), _排名Model.getTop());
		_第二名数量.setBackground(backcolor);
		_第二名数量.setFont(SWTResourceManager.getFont("宋体", _排名Model.getFontSize(),
				_排名Model.getRgb().contains("#") ? SWT.BOLD : SWT.NORMAL));
		_第二名数量.setForeground(fontColor);
		_第二名数量.setSize(_排名Model.getWidth(), _排名Model.getHeight());

		_排名Model = CacheUtils.get(CacheUtils._第三名_数量);
		if (_排名Model.getRgb().contains("|")) {
			String[] rgbs = _排名Model.getRgb().split("\\|");
			fontColor = ResourceUtils.getColor(rgbs[0]);
			backcolor = ResourceUtils.getColor(rgbs[1]);
		} else {
			fontColor = ResourceUtils.getColor(_排名Model.getRgb());
			backcolor = SWTResourceManager.getColor(rgb);
		}
		_第三名数量.setLocation(_排名Model.getLeft(), _排名Model.getTop());
		_第三名数量.setBackground(backcolor);
		_第三名数量.setFont(SWTResourceManager.getFont("宋体", _排名Model.getFontSize(),
				_排名Model.getRgb().contains("#") ? SWT.BOLD : SWT.NORMAL));
		_第三名数量.setForeground(fontColor);
		_第三名数量.setSize(_排名Model.getWidth(), _排名Model.getHeight());

		_排名Model = CacheUtils.get(CacheUtils._第四名_数量);
		if (_排名Model.getRgb().contains("|")) {
			String[] rgbs = _排名Model.getRgb().split("\\|");
			fontColor = ResourceUtils.getColor(rgbs[0]);
			backcolor = ResourceUtils.getColor(rgbs[1]);
		} else {
			fontColor = ResourceUtils.getColor(_排名Model.getRgb());
			backcolor = SWTResourceManager.getColor(rgb);
		}
		_第四名数量.setLocation(_排名Model.getLeft(), _排名Model.getTop());
		_第四名数量.setBackground(backcolor);
		_第四名数量.setFont(SWTResourceManager.getFont("宋体", _排名Model.getFontSize(),
				_排名Model.getRgb().contains("#") ? SWT.BOLD : SWT.NORMAL));
		_第四名数量.setForeground(fontColor);
		_第四名数量.setSize(_排名Model.getWidth(), _排名Model.getHeight());

		_排名Model = CacheUtils.get(CacheUtils._第五名_数量);
		if (_排名Model.getRgb().contains("|")) {
			String[] rgbs = _排名Model.getRgb().split("\\|");
			fontColor = ResourceUtils.getColor(rgbs[0]);
			backcolor = ResourceUtils.getColor(rgbs[1]);
		} else {
			fontColor = ResourceUtils.getColor(_排名Model.getRgb());
			backcolor = SWTResourceManager.getColor(rgb);
		}
		_第五名数量.setLocation(_排名Model.getLeft(), _排名Model.getTop());
		_第五名数量.setBackground(backcolor);
		_第五名数量.setFont(SWTResourceManager.getFont("宋体", _排名Model.getFontSize(),
				_排名Model.getRgb().contains("#") ? SWT.BOLD : SWT.NORMAL));
		_第五名数量.setForeground(fontColor);
		_第五名数量.setSize(_排名Model.getWidth(), _排名Model.getHeight());

		_排名Model = CacheUtils.get(CacheUtils._第六名_数量);
		if (_排名Model.getRgb().contains("|")) {
			String[] rgbs = _排名Model.getRgb().split("\\|");
			fontColor = ResourceUtils.getColor(rgbs[0]);
			backcolor = ResourceUtils.getColor(rgbs[1]);
		} else {
			fontColor = ResourceUtils.getColor(_排名Model.getRgb());
			backcolor = SWTResourceManager.getColor(rgb);
		}
		_第六名数量.setLocation(_排名Model.getLeft(), _排名Model.getTop());
		_第六名数量.setBackground(backcolor);
		_第六名数量.setFont(SWTResourceManager.getFont("宋体", _排名Model.getFontSize(),
				_排名Model.getRgb().contains("#") ? SWT.BOLD : SWT.NORMAL));
		_第六名数量.setForeground(fontColor);
		_第六名数量.setSize(_排名Model.getWidth(), _排名Model.getHeight());

		_排名Model = CacheUtils.get(CacheUtils._第七名_数量);
		if (_排名Model.getRgb().contains("|")) {
			String[] rgbs = _排名Model.getRgb().split("\\|");
			fontColor = ResourceUtils.getColor(rgbs[0]);
			backcolor = ResourceUtils.getColor(rgbs[1]);
		} else {
			fontColor = ResourceUtils.getColor(_排名Model.getRgb());
			backcolor = SWTResourceManager.getColor(rgb);
		}
		_第七名数量.setLocation(_排名Model.getLeft(), _排名Model.getTop());
		_第七名数量.setBackground(backcolor);
		_第七名数量.setFont(SWTResourceManager.getFont("宋体", _排名Model.getFontSize(),
				_排名Model.getRgb().contains("#") ? SWT.BOLD : SWT.NORMAL));
		_第七名数量.setForeground(fontColor);
		_第七名数量.setSize(_排名Model.getWidth(), _排名Model.getHeight());

		_排名Model = CacheUtils.get(CacheUtils._第八名_数量);
		if (_排名Model.getRgb().contains("|")) {
			String[] rgbs = _排名Model.getRgb().split("\\|");
			fontColor = ResourceUtils.getColor(rgbs[0]);
			backcolor = ResourceUtils.getColor(rgbs[1]);
		} else {
			fontColor = ResourceUtils.getColor(_排名Model.getRgb());
			backcolor = SWTResourceManager.getColor(rgb);
		}
		_第八名数量.setLocation(_排名Model.getLeft(), _排名Model.getTop());
		_第八名数量.setBackground(backcolor);
		_第八名数量.setFont(SWTResourceManager.getFont("宋体", _排名Model.getFontSize(),
				_排名Model.getRgb().contains("#") ? SWT.BOLD : SWT.NORMAL));
		_第八名数量.setForeground(fontColor);
		_第八名数量.setSize(_排名Model.getWidth(), _排名Model.getHeight());

		_排名Model = CacheUtils.get(CacheUtils._第九名_数量);
		if (_排名Model.getRgb().contains("|")) {
			String[] rgbs = _排名Model.getRgb().split("\\|");
			fontColor = ResourceUtils.getColor(rgbs[0]);
			backcolor = ResourceUtils.getColor(rgbs[1]);
		} else {
			fontColor = ResourceUtils.getColor(_排名Model.getRgb());
			backcolor = SWTResourceManager.getColor(rgb);
		}
		_第九名数量.setLocation(_排名Model.getLeft(), _排名Model.getTop());
		_第九名数量.setBackground(backcolor);
		_第九名数量.setFont(SWTResourceManager.getFont("宋体", _排名Model.getFontSize(),
				_排名Model.getRgb().contains("#") ? SWT.BOLD : SWT.NORMAL));
		_第九名数量.setForeground(fontColor);
		_第九名数量.setSize(_排名Model.getWidth(), _排名Model.getHeight());

		_排名Model = CacheUtils.get(CacheUtils._总人数);
		if (_排名Model != null) {
			if (_排名Model.getRgb().contains("|")) {
				String[] rgbs = _排名Model.getRgb().split("\\|");
				fontColor = ResourceUtils.getColor(rgbs[0]);
				backcolor = ResourceUtils.getColor(rgbs[1]);
			} else {
				fontColor = ResourceUtils.getColor(_排名Model.getRgb());
				backcolor = SWTResourceManager.getColor(rgb);
			}
			_总人数.setLocation(_排名Model.getLeft(), _排名Model.getTop());
			_总人数.setBackground(backcolor);
			_总人数.setFont(SWTResourceManager.getFont("宋体", _排名Model
					.getFontSize(), _排名Model.getRgb().contains("#") ? SWT.BOLD
					: SWT.NORMAL));
			_总人数.setForeground(fontColor);
			_总人数.setSize(_排名Model.getWidth(), _排名Model.getHeight());
		}

		_排名Model = CacheUtils.get(CacheUtils._总数量);
		if (_排名Model.getRgb().contains("|")) {
			String[] rgbs = _排名Model.getRgb().split("\\|");
			fontColor = ResourceUtils.getColor(rgbs[0]);
			backcolor = ResourceUtils.getColor(rgbs[1]);
		} else {
			fontColor = ResourceUtils.getColor(_排名Model.getRgb());
			backcolor = SWTResourceManager.getColor(rgb);
		}
		_总数量.setLocation(_排名Model.getLeft(), _排名Model.getTop());
		_总数量.setBackground(backcolor);
		_总数量.setFont(SWTResourceManager.getFont("宋体", _排名Model.getFontSize(),
				_排名Model.getRgb().contains("#") ? SWT.BOLD : SWT.NORMAL));
		_总数量.setForeground(fontColor);
		_总数量.setSize(_排名Model.getWidth(), _排名Model.getHeight());
	}

	public static class MoveListener implements Listener {

		private Shell dialogshell;

		public MoveListener(Shell dialogshell) {
			this.dialogshell = dialogshell;
		}

		private int x, y;

		public void handleEvent(Event e) {
			if (e.type == SWT.MouseDown && e.button == 1) {
				x = e.x;
				y = e.y;
			}
			if (e.type == SWT.MouseMove && (e.stateMask & SWT.BUTTON1) != 0) {
				Point p = dialogshell.toDisplay(e.x, e.y);
				p.x -= x;
				p.y -= y;
				dialogshell.setLocation(p);
			}
		}
	}
}
