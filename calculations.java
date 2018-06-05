package edu.school.calculations;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics2D;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

public class calculations extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtc;
	private JButton btncalculate;
	private JRadioButton rbtnline;
	private JRadioButton rbtnsqare;
	private JRadioButton rbtnbisqare;
	private JLabel lblresult;
	private JLabel lblc;
	private JLabel lblb;
	private JLabel lbla;
	private JLabel lblline;
	private JLabel lblsqare;
	private JLabel lblbisqare;
	int calculations = 0;
	String result = "";
	double diskriminant, a, b, c, y = 0, zoom;
	boolean is_zoom_typed = true, is_a_typed = true, is_b_typed = true, is_c_typed = true;
	private JLabel lbllinefunction;
	private JLabel lblfunction;
	private JLabel lblbisqarefunction;
	private JLabel lblsqarefunction;
	private JPanel pnlfunction;
	private JLabel lblminusx;
	private JLabel lblminusy;
	private JLabel lblx;
	private JLabel lbly;
	private JButton btnclear;
	private JTextField txtzoom;
	private JLabel lblzoom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculations frame = new calculations();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculations() {
		setTitle("\u041F\u0440\u043E\u0433\u0440\u0430\u043C\u0430 \u0437\u0430 \u0438\u0437\u0447\u0438\u0441\u043B\u0435\u043D\u0438\u044F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 680);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		rbtnline = new JRadioButton(
				"\u041B\u0438\u043D\u0435\u0439\u043D\u043E \u0443\u0440\u0430\u0432\u043D\u0435\u043D\u0438\u0435");
		rbtnline.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txta.setVisible(true);
				txtb.setVisible(true);
				lblline.setVisible(true);
				lbla.setVisible(true);
				lblb.setVisible(true);
				btncalculate.setVisible(true);
				btnclear.setVisible(true);
				txtc.setVisible(false);
				lblsqare.setVisible(false);
				lblbisqare.setVisible(false);
				lblc.setVisible(false);
				lblfunction.setVisible(true);
				lbllinefunction.setVisible(true);
				lblsqarefunction.setVisible(false);
				lblbisqarefunction.setVisible(false);
				lblx.setVisible(true);
				lbly.setVisible(true);
				lblminusx.setVisible(true);
				lblminusy.setVisible(true);
				txtzoom.setVisible(true);
				lblzoom.setVisible(true);
				calculations = 1;

			}
		});
		buttonGroup.add(rbtnline);
		rbtnline.setBounds(0, 7, 141, 23);
		contentPane.add(rbtnline);

		rbtnsqare = new JRadioButton(
				"\u041A\u0432\u0430\u0434\u0440\u0430\u0442\u043D\u043E \u0443\u0440\u0430\u0432\u043D\u0435\u043D\u0438\u0435");
		rbtnsqare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txta.setVisible(true);
				txtb.setVisible(true);
				lblline.setVisible(false);
				lbla.setVisible(true);
				lblb.setVisible(true);
				btncalculate.setVisible(true);
				btnclear.setVisible(true);
				txtc.setVisible(true);
				lblsqare.setVisible(true);
				lblbisqare.setVisible(false);
				lblc.setVisible(true);
				lblfunction.setVisible(true);
				lbllinefunction.setVisible(false);
				lblsqarefunction.setVisible(true);
				lblbisqarefunction.setVisible(false);
				lblx.setVisible(true);
				lbly.setVisible(true);
				lblminusx.setVisible(true);
				lblminusy.setVisible(true);
				txtzoom.setVisible(true);
				lblzoom.setVisible(true);
				calculations = 2;

			}
		});
		buttonGroup.add(rbtnsqare);
		rbtnsqare.setBounds(143, 7, 163, 23);
		contentPane.add(rbtnsqare);

		rbtnbisqare = new JRadioButton(
				"\u0411\u0438\u043A\u0432\u0430\u0434\u0440\u0430\u0442\u043D\u043E \u0443\u0440\u0430\u0432\u043D\u0435\u043D\u0438\u0435");
		rbtnbisqare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txta.setVisible(true);
				txtb.setVisible(true);
				lblline.setVisible(false);
				lbla.setVisible(true);
				lblb.setVisible(true);
				btncalculate.setVisible(true);
				btnclear.setVisible(true);
				txtc.setVisible(true);
				lblsqare.setVisible(false);
				lblbisqare.setVisible(true);
				lblc.setVisible(true);
				lblfunction.setVisible(true);
				lbllinefunction.setVisible(false);
				lblsqarefunction.setVisible(false);
				lblbisqarefunction.setVisible(true);
				lblx.setVisible(true);
				lbly.setVisible(true);
				lblminusx.setVisible(true);
				lblminusy.setVisible(true);
				txtzoom.setVisible(true);
				lblzoom.setVisible(true);
				calculations = 3;

			}
		});
		buttonGroup.add(rbtnbisqare);
		rbtnbisqare.setBounds(308, 7, 176, 23);
		contentPane.add(rbtnbisqare);

		txta = new JTextField();
		txta.setVisible(false);
		txta.setBounds(49, 65, 92, 20);
		contentPane.add(txta);
		txta.setColumns(10);

		txtb = new JTextField();
		txtb.setVisible(false);
		txtb.setBounds(201, 65, 92, 20);
		contentPane.add(txtb);
		txtb.setColumns(10);

		txtc = new JTextField();
		txtc.setVisible(false);
		txtc.setBounds(347, 65, 92, 20);
		contentPane.add(txtc);
		txtc.setColumns(10);

		btncalculate = new JButton(
				"\u041F\u0440\u0435\u0441\u043C\u0435\u0442\u043D\u0438 \u0438 \u041D\u0430\u0447\u0435\u0440\u0442\u0430\u0439");
		btncalculate.setVisible(false);
		btncalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Graphics2D g = (Graphics2D) pnlfunction.getGraphics();
				result = "";
				if (txtzoom.getText().isEmpty()) {
					result += "Please enter value for zoom!";
					lblresult.setText(result);
					is_zoom_typed = false;
				} else {
					if (Double.parseDouble(txtzoom.getText()) > 0) {
						zoom = Double.parseDouble(txtzoom.getText());
						is_zoom_typed = true;
					} else {
						is_zoom_typed = false;
						result += "Please enter a positive value for zoom!";
						lblresult.setText(result);
					}
				}
				if (is_zoom_typed == true) {
					lblx.setText("x=" + 175 * zoom);
					lblminusx.setText("x=" + -175 * zoom);
					lbly.setText("y=" + 175 * zoom);
					lblminusy.setText("y=" + -175 * zoom);
				}
				if (calculations == 1) {
					if (txta.getText().isEmpty()) {
						result += "Please enter value for a!";
						lblresult.setText(result);
						is_a_typed = false;
					} else {
						a = Double.parseDouble(txta.getText());
						is_a_typed = true;
					}
					if (txtb.getText().isEmpty()) {
						result += "Please enter value for b!";
						lblresult.setText(result);
						is_b_typed = false;
					} else {
						b = Double.parseDouble(txtb.getText());
						is_b_typed = true;
					}
					if (is_a_typed == true & is_b_typed == true & is_zoom_typed == true) {
						result = "x=" + -b / a;
						lblresult.setText(result);
						g.clearRect(0, 0, 350, 350);
						g.setColor(Color.BLACK);
						g.setStroke(new BasicStroke(3));
						g.drawLine(0, 175, 350, 175);
						g.drawLine(175, 0, 175, 350);
						g.setStroke(new BasicStroke(1));
						g.setColor(Color.blue);

						double linearfirstpointd = ((-175 * zoom - b) / (a)) / zoom + 175;
						int linearfirstpointi = (int) linearfirstpointd;
						double linearsecondpointd = ((175 * zoom - b) / (a)) / zoom + 175;
						int linearsecondpointi = (int) linearsecondpointd;
						g.drawLine(linearfirstpointi, 350, linearsecondpointi, 0);
					}
				}
				if (calculations == 2) {
					if (txta.getText().isEmpty()) {
						result += "Please enter value for a!";
						lblresult.setText(result);
						is_a_typed = false;
					} else {
						a = Double.parseDouble(txta.getText());
						is_a_typed = true;
					}
					if (txtb.getText().isEmpty()) {
						result += " Please enter value for b!";
						lblresult.setText(result);
						is_b_typed = false;
					} else {
						b = Double.parseDouble(txtb.getText());
						is_b_typed = true;

					}
					if (txtc.getText().isEmpty()) {
						result += "Please enter value for c!";
						lblresult.setText(result);
						is_c_typed = false;
					} else {
						c = Double.parseDouble(txtc.getText());
						is_c_typed = true;
					}
					if (is_a_typed == true & is_b_typed == true & is_c_typed == true & is_zoom_typed == true) {
						diskriminant = Math.pow(b, 2) - 4 * a * c;
						if (diskriminant > 0) {
							result = "x1=" + (-b + Math.sqrt(diskriminant)) / (2 * a) + ";x2="
									+ (-b - Math.sqrt(diskriminant)) / (2 * a);
							lblresult.setText(result);
						}
						if (diskriminant == 0) {
							result = "x1/2=" + -b / (2 * a);
							lblresult.setText(result);
						}
						if (diskriminant < 0) {
							result = "No results!";
							lblresult.setText(result);
						}

						g.clearRect(0, 0, 350, 350);
						g.setColor(Color.BLACK);
						g.setStroke(new BasicStroke(2));
						g.drawLine(0, 175, 350, 175);
						g.drawLine(175, 0, 175, 350);
						g.setStroke(new BasicStroke(1));
						g.setColor(Color.blue);
						if (a > 0) {
							y = 175 * zoom;
							int height = 0;
							boolean sqaregrafhics = true;
							while (sqaregrafhics == true) {
								diskriminant = Math.pow(b, 2) - 4 * a * (c - y);
								if (diskriminant > 0) {
									double dgraphicsqarerootone = ((-b + Math.sqrt(diskriminant)) / (2 * a)) / zoom
											+ 175;
									int igraphicsqarerootone = (int) dgraphicsqarerootone;
									g.drawLine(igraphicsqarerootone, height, igraphicsqarerootone, height);
									double dgraphicsqareroottwo = ((-b - Math.sqrt(diskriminant)) / (2 * a)) / zoom
											+ 175;
									int igraphicsqareroottwo = (int) dgraphicsqareroottwo;
									g.drawLine(igraphicsqareroottwo, height, igraphicsqareroottwo, height);
								}
								if (diskriminant == 0) {
									double dgraphicsqareroottre = (-b) / (2 * a) / zoom + 175;
									int igraphicsqareroottre = (int) dgraphicsqareroottre;
									g.drawLine(igraphicsqareroottre, height, igraphicsqareroottre, height);
								}
								if (diskriminant < 0) {
									sqaregrafhics = false;
								}
								y = y - zoom;
								height++;
							}
						}

						if (a < 0) {
							y = -175 * zoom;
							int height = 350;
							boolean sqaregrafhics = true;
							while (sqaregrafhics == true) {
								diskriminant = Math.pow(b, 2) - 4 * a * (c - y);
								if (diskriminant > 0) {
									double dgraphicsqarerootone = ((-b + Math.sqrt(diskriminant)) / (2 * a)) / zoom
											+ 175;
									int igraphicsqarerootone = (int) dgraphicsqarerootone;
									g.drawLine(igraphicsqarerootone, height, igraphicsqarerootone, height);
									double dgraphicsqareroottwo = ((-b - Math.sqrt(diskriminant)) / (2 * a)) / zoom
											+ 175;
									int igraphicsqareroottwo = (int) dgraphicsqareroottwo;
									g.drawLine(igraphicsqareroottwo, height, igraphicsqareroottwo, height);
								}
								if (diskriminant == 0) {
									double dgraphicsqareroottre = ((-b) / (2 * a)) / zoom + 175;
									int igraphicsqareroottre = (int) dgraphicsqareroottre;
									g.drawLine(igraphicsqareroottre, height, igraphicsqareroottre, height);
								}
								if (diskriminant < 0) {
									sqaregrafhics = false;
								}
								y = y + zoom;
								height--;
							}
						}
						if (a == 0) {
							double dqwerx = ((-175 * zoom - c) / (b)) / zoom;
							int iq = (int) dqwerx;
							double dqwerty = ((175 * zoom - c) / (b)) / zoom;
							int jq = (int) dqwerty;
							g.drawLine(iq + 175, 350, jq + 175, 0);
						}

					}
				}
				if (calculations == 3) {
					if (txta.getText().isEmpty()) {
						result += "Please enter value for a!";
						lblresult.setText(result);
						is_a_typed = false;
					} else {
						if(Double.parseDouble(txta.getText())!=0) {
						a = Double.parseDouble(txta.getText());
						is_a_typed = true;
						}else {
						result="0 is not a valid value for a!";
						lblresult.setText(result);
						is_a_typed = false;
						}
					}
					if (txtb.getText().isEmpty()) {
						result += "Please enter value for b!";
						lblresult.setText(result);
						is_b_typed = false;
					} else {
						b = Double.parseDouble(txtb.getText());
						is_b_typed = true;
					}
					if (txtc.getText().isEmpty()) {
						result += "Please enter value for c!";
						lblresult.setText(result);
						is_c_typed = false;
					} else {
						c = Double.parseDouble(txtc.getText());
						is_c_typed = true;
					}
					if (is_a_typed == true & is_b_typed == true & is_zoom_typed == true) {
						diskriminant = Math.pow(b, 2) - 4 * a * c;
						if (diskriminant > 0) {
							if ((-b + Math.sqrt(diskriminant)) / (2 * a) > 0) {
								result = "x1=" + Math.sqrt((-b + Math.sqrt(diskriminant)) / (2 * a)) + ";x2="
										+ -Math.sqrt((-b + Math.sqrt(diskriminant)) / (2 * a));
							} else {
								result = "x1=No result!;x2=No result!";
							}

							if ((-b - Math.sqrt(diskriminant)) / (2 * a) > 0) {
								result += "x3=" + Math.sqrt((-b - Math.sqrt(diskriminant)) / (2 * a)) + ";x4="
										+ -Math.sqrt((-b - Math.sqrt(diskriminant)) / (2 * a));
							} else {
								result += "x3=No result!;x4=No result!";
							}

							lblresult.setText(result);
						}
						if (diskriminant == 0) {
							if (-b / (2 * a) > 0) {
								result = "x1=" + Math.sqrt(-b / (2 * a)) + ";x2=" + -Math.sqrt(-b / (2 * a));
							} else {
								result = "x1=No results!;x2=No results!";
							}
							lblresult.setText(result);
						}
						if (diskriminant < 0) {
							result = "No results!";
							lblresult.setText(result);
						}

						g.clearRect(0, 0, 350, 350);
						g.setColor(Color.BLACK);
						g.setStroke(new BasicStroke(2));
						g.drawLine(0, 175, 350, 175);
						g.drawLine(175, 0, 175, 350);
						g.setStroke(new BasicStroke(1));
						g.setColor(Color.blue);

						if (a > 0) {
							y = 175 * zoom;
							int height = 0;
							boolean bisqaregrafhics = true;
							while (bisqaregrafhics == true) {
								diskriminant = Math.pow(b, 2) - 4 * a * (c - y);
								if (diskriminant > 0) {
									if ((-b + Math.sqrt(diskriminant)) / (2 * a) > 0) {
										double dbisqaregraphicsrootone = Math
												.sqrt((-b + Math.sqrt(diskriminant)) / (2 * a)) / zoom + 175;
										int ibisqaregraphicsrootone = (int) dbisqaregraphicsrootone;
										g.drawLine(ibisqaregraphicsrootone, height, ibisqaregraphicsrootone, height);
										double dbisqaregraphicsroottwo = -Math
												.sqrt((-b + Math.sqrt(diskriminant)) / (2 * a)) / zoom + 175;
										int ibisqaregraphicsroottwo = (int) dbisqaregraphicsroottwo;
										g.drawLine(ibisqaregraphicsroottwo, height, ibisqaregraphicsroottwo, height);

									}

									if ((-b - Math.sqrt(diskriminant)) / (2 * a) > 0) {
										double dbisqaregraphicsrootthree = Math
												.sqrt((-b - Math.sqrt(diskriminant)) / (2 * a)) / zoom + 175;
										int ibisqaregraphicsrootthree = (int) dbisqaregraphicsrootthree;
										g.drawLine(ibisqaregraphicsrootthree, height, ibisqaregraphicsrootthree,
												height);
										double dbisqaregraphicsrootfour = -Math
												.sqrt((-b - Math.sqrt(diskriminant)) / (2 * a)) / zoom + 175;
										int ibisqaregraphicsrootfour = (int) dbisqaregraphicsrootfour;
										g.drawLine(ibisqaregraphicsrootfour, height, ibisqaregraphicsrootfour, height);
									}

								}
								if (diskriminant == 0) {
									if (-b / (2 * a) > 0) {
										double dbisqaregraphicsrootfive = Math.sqrt(-b / (2 * a)) / zoom + 175;
										int ibisqaregraphicsrootfive = (int) dbisqaregraphicsrootfive;
										g.drawLine(ibisqaregraphicsrootfive, height, ibisqaregraphicsrootfive, height);
										double dbisqaregraphicsrootsix = -Math.sqrt(-b / (2 * a)) / zoom + 175;
										int ibisqaregraphicsrootsix = (int) dbisqaregraphicsrootsix;
										g.drawLine(ibisqaregraphicsrootsix, height, ibisqaregraphicsrootsix, height);
									}

								}
								if (diskriminant < 0) {
									bisqaregrafhics = false;
								}
								y = y - zoom;
								height++;
							}
						}

						if (a < 0) {
							y = -175 * zoom;
							int height = 350;
							boolean bisqaregrafhics = true;
							while (bisqaregrafhics == true) {
								diskriminant = Math.pow(b, 2) - 4 * a * (c - y);
								if (diskriminant > 0) {
									if ((-b + Math.sqrt(diskriminant)) / (2 * a) > 0) {
										double dbisqaregraphicsrootone = Math
												.sqrt((-b + Math.sqrt(diskriminant)) / (2 * a)) / zoom + 175;
										int ibisqaregraphicsrootone = (int) dbisqaregraphicsrootone;
										g.drawLine(ibisqaregraphicsrootone, height, ibisqaregraphicsrootone, height);
										double dbisqaregraphicsroottwo = -Math
												.sqrt((-b + Math.sqrt(diskriminant)) / (2 * a)) / zoom + 175;
										int ibisqaregraphicsroottwo = (int) dbisqaregraphicsroottwo;
										g.drawLine(ibisqaregraphicsroottwo, height, ibisqaregraphicsroottwo, height);

									}

									if ((-b - Math.sqrt(diskriminant)) / (2 * a) > 0) {
										double dbisqaregraphicsrootthree = Math
												.sqrt((-b - Math.sqrt(diskriminant)) / (2 * a)) / zoom + 175;
										int ibisqaregraphicsrootthree = (int) dbisqaregraphicsrootthree;
										g.drawLine(ibisqaregraphicsrootthree, height, ibisqaregraphicsrootthree,
												height);
										double dbisqaregraphicsrootfour = -Math
												.sqrt((-b - Math.sqrt(diskriminant)) / (2 * a)) / zoom + 175;
										int ibisqaregraphicsrootfour = (int) dbisqaregraphicsrootfour;
										g.drawLine(ibisqaregraphicsrootfour, height, ibisqaregraphicsrootfour, height);
									}

								}
								if (diskriminant == 0) {
									if (-b / (2 * a) > 0) {
										double dbisqaregraphicsrootfive = Math.sqrt(-b / (2 * a)) / zoom + 175;
										int ibisqaregraphicsrootfive = (int) dbisqaregraphicsrootfive;
										g.drawLine(ibisqaregraphicsrootfive, height, ibisqaregraphicsrootfive, height);
										double dbisqaregraphicsrootsix = -Math.sqrt(-b / (2 * a)) / zoom + 175;
										int ibisqaregraphicsrootsix = (int) dbisqaregraphicsrootsix;
										g.drawLine(ibisqaregraphicsrootsix, height, ibisqaregraphicsrootsix, height);
									}

								}
								if (diskriminant < 0) {
									bisqaregrafhics = false;
								}
								y += zoom;
								height--;
							}
						}

					}

				}
			}
		});
		btncalculate.setBounds(49, 96, 184, 33);
		contentPane.add(btncalculate);

		lblline = new JLabel("a*x+b=0");
		lblline.setVisible(false);
		lblline.setHorizontalAlignment(SwingConstants.CENTER);
		lblline.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblline.setBounds(161, 37, 106, 33);
		contentPane.add(lblline);

		lblsqare = new JLabel("a*x^2+b*x+c=0");
		lblsqare.setVisible(false);
		lblsqare.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblsqare.setHorizontalAlignment(SwingConstants.CENTER);
		lblsqare.setBounds(130, 37, 163, 33);
		contentPane.add(lblsqare);

		lblbisqare = new JLabel("a*x^4+b*x^2+c=0");
		lblbisqare.setVisible(false);
		lblbisqare.setHorizontalAlignment(SwingConstants.CENTER);
		lblbisqare.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblbisqare.setBounds(130, 37, 186, 33);
		contentPane.add(lblbisqare);

		lbla = new JLabel("a=");
		lbla.setVisible(false);
		lbla.setHorizontalAlignment(SwingConstants.CENTER);
		lbla.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbla.setBounds(17, 64, 29, 21);
		contentPane.add(lbla);

		lblb = new JLabel("b=");
		lblb.setVisible(false);
		lblb.setHorizontalAlignment(SwingConstants.CENTER);
		lblb.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblb.setBounds(161, 65, 29, 21);
		contentPane.add(lblb);

		lblc = new JLabel("c=");
		lblc.setVisible(false);
		lblc.setHorizontalAlignment(SwingConstants.CENTER);
		lblc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblc.setBounds(308, 64, 29, 21);
		contentPane.add(lblc);

		lblresult = new JLabel("");
		lblresult.setHorizontalAlignment(SwingConstants.CENTER);
		lblresult.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblresult.setBounds(0, 140, 474, 33);
		contentPane.add(lblresult);

		lblfunction = new JLabel(
				"\u0413\u0440\u0430\u0444\u0438\u043A\u0430 \u043D\u0430 \u0444\u0443\u043D\u043A\u0446\u0438\u044F");
		lblfunction.setVisible(false);
		lblfunction.setHorizontalAlignment(SwingConstants.CENTER);
		lblfunction.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblfunction.setBounds(17, 184, 205, 23);
		contentPane.add(lblfunction);

		lbllinefunction = new JLabel("y=a*x+b");
		lbllinefunction.setVisible(false);
		lbllinefunction.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbllinefunction.setHorizontalAlignment(SwingConstants.CENTER);
		lbllinefunction.setBounds(290, 184, 114, 23);
		contentPane.add(lbllinefunction);

		lblsqarefunction = new JLabel("y=a*x^2+b*x+c");
		lblsqarefunction.setVisible(false);
		lblsqarefunction.setForeground(Color.BLACK);
		lblsqarefunction.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblsqarefunction.setEnabled(false);
		lblsqarefunction.setBounds(244, 184, 195, 23);
		contentPane.add(lblsqarefunction);

		lblbisqarefunction = new JLabel("y=a*x^4+b*x^2+c");
		lblbisqarefunction.setVisible(false);
		lblbisqarefunction.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblbisqarefunction.setBounds(240, 184, 220, 23);
		contentPane.add(lblbisqarefunction);

		pnlfunction = new JPanel();
		pnlfunction.setBounds(71, 243, 350, 350);
		contentPane.add(pnlfunction);

		lblx = new JLabel("x=175");
		lblx.setHorizontalAlignment(SwingConstants.CENTER);
		lblx.setVisible(false);
		lblx.setBounds(431, 404, 56, 14);
		contentPane.add(lblx);

		lbly = new JLabel("y=175");
		lbly.setVisible(false);
		lbly.setHorizontalAlignment(SwingConstants.CENTER);
		lbly.setBounds(201, 218, 72, 14);
		contentPane.add(lbly);

		lblminusx = new JLabel("x=-175");
		lblminusx.setHorizontalAlignment(SwingConstants.CENTER);
		lblminusx.setVisible(false);
		lblminusx.setBounds(5, 404, 56, 14);
		contentPane.add(lblminusx);

		lblminusy = new JLabel("y=-175");
		lblminusy.setVisible(false);
		lblminusy.setHorizontalAlignment(SwingConstants.CENTER);
		lblminusy.setBounds(213, 604, 92, 14);
		contentPane.add(lblminusy);

		btnclear = new JButton("\u0418\u0437\u0447\u0438\u0441\u0442\u0438");
		btnclear.setVisible(false);
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Graphics2D g = (Graphics2D) pnlfunction.getGraphics();
				g.clearRect(0, 0, 350, 350);
				g.setColor(Color.BLACK);
				g.setStroke(new BasicStroke(2));
				g.drawLine(0, 175, 350, 175);
				g.drawLine(175, 0, 175, 350);
				g.setStroke(new BasicStroke(1));
				result = "";
				lblresult.setText(result);
				txta.setText("");
				txtb.setText("");
				txtc.setText("");

			}
		});
		btnclear.setBounds(290, 96, 131, 33);
		contentPane.add(btnclear);

		txtzoom = new JTextField();
		txtzoom.setVisible(false);
		txtzoom.setHorizontalAlignment(SwingConstants.CENTER);
		txtzoom.setText("1");
		txtzoom.setBounds(119, 615, 60, 20);
		contentPane.add(txtzoom);
		txtzoom.setColumns(10);

		lblzoom = new JLabel("Zoom:");
		lblzoom.setVisible(false);
		lblzoom.setHorizontalAlignment(SwingConstants.CENTER);
		lblzoom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblzoom.setBounds(49, 616, 60, 14);
		contentPane.add(lblzoom);
	}
}
