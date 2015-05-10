/**
 * @author  Manojkumar V
 */
import java.awt.*;
import javax.swing.*;
import java.lang.Math;
import java.awt.event.*;
import java.awt.event.ActionListener;
class calculator {
	public static JFrame window = new JFrame();
	public static double num = 0, result = 0;
	public static int d = 0, symbolcounter = 0, se = 0, ic = 0, event = 0, n = 1, specialfunction = 0, specialfunction2 = 0, specialfunction3 = 0, equalevent = 0, mode = 0, pevent = 0, pe = 0;
	public static JTextField ans, detail1, detail2, detail3;
	public static String dis = " ";
	public static String det1 = " ", det2 = " ", det3 = " ";
	public static JButton n1 = new JButton("1");
	public static JButton n2 = new JButton("2");
	public static JButton n3 = new JButton("3");
	public static JButton n4 = new JButton("4");
	public static JButton n5 = new JButton("5");
	public static JButton n6 = new JButton("6");
	public static JButton n7 = new JButton("7");
	public static JButton n8 = new JButton("8");
	public static JButton n9 = new JButton("9");
	public static JButton n0 = new JButton("0");
	public static JButton plus = new JButton("+");
	public static JButton minus = new JButton("-");
	public static JButton mult = new JButton("*");
	public static JButton div = new JButton("/");
	public static JButton equal = new JButton("=");
	public static JButton dot = new JButton(".");
	public static JButton root = new JButton("rt");
	public static JButton square = new JButton("x^2");
	public static JButton clear = new JButton("C");
	public static JButton by = new JButton("1/x");
	public static JButton abs = new JButton("abs");
	public static JButton fact = new JButton("n!");
	public static JButton cube = new JButton("x^3");
	public static JButton log = new JButton("log");
	public static JButton sin = new JButton("sin");
	public static JButton cos = new JButton("cos");
	public static JButton tan = new JButton("tan");
	public static JButton csc = new JButton("csc");
	public static JButton sec = new JButton("sec");
	public static JButton cot = new JButton("cot");
	public static JButton adv = new JButton("adv");
	public static JButton prp = new JButton("prp");
	public static JButton basic = new JButton("bas");

	public static void resize(int m, int n) {
		window.setResizable(true);
		window.setSize(m, n);
		window.setResizable(false);
	}

	public static void reset() {
		d = 0;
		symbolcounter = 0;
		se = 0;
		ic = 0;
		event = 0;
		n = 1;
		specialfunction = 0;
		specialfunction2 = 0;
		specialfunction3 = 0;
		equalevent = 0;
		num = 0;
		pe = 0;
		result = 0;
		dis = " ";
	}

	public static void properties(double n) {
		det1 = " ";
		det2 = " ";
		det3 = " ";
		double p = 0; {
			if (n < 0) {
				detail1.setText(det1 + "The number is Negative");
			} else if (n > 0) {
				detail1.setText(det1 + "The number is Positive");
			} else if (n == 0) {
				detail1.setText(det1 + "The number is Zero");
			}
		} {
			if (n % 1 != 0) {
				detail2.setText(det2 + "The number is a decimal value");
				detail3.setText(det3 + "Cannot check for special properties");
			} else if (n % 1 == 0) {
				{
					for (double i = 1; i <= n; i++) {
						if (n % i == 0) {
							p++;
						}
					}
					if (p == 2) {
						detail2.setText(det2 + "The number is Prime");
					} else if (p > 2) {
						detail2.setText(det2 + "The number is not Prime");
					}
				} {
					if (n % 2 == 0) {
						detail3.setText(det3 + "The number is Even");
					} else if (n % 2 != 0) {
						detail3.setText(det3 + "The number is Odd");
					}
				}
			}
		}
	}

	public static void main(String args[]) {
		resize(305, 157);
		JPanel top = new JPanel();
		top.setLayout(null);
		ans = new JTextField();
		detail1 = new JTextField();
		detail2 = new JTextField();
		detail3 = new JTextField();
		window.setContentPane(top);
		top.add(n1);
		top.add(n2);
		top.add(n3);
		top.add(n4);
		top.add(n5);
		top.add(n6);
		top.add(n7);
		top.add(n8);
		top.add(n9);
		top.add(n0);
		top.add(plus);
		top.add(minus);
		top.add(mult);
		top.add(div);
		top.add(equal);
		top.add(dot);
		top.add(ans);
		top.add(root);
		top.add(square);
		top.add(clear);
		top.add(by);
		top.add(abs);
		top.add(sin);
		top.add(cos);
		top.add(tan);
		top.add(csc);
		top.add(sec);
		top.add(cot);
		top.add(adv);
		top.add(prp);
		top.add(fact);
		top.add(log);
		top.add(cube);
		top.add(basic);
		top.add(detail1);
		top.add(detail2);
		top.add(detail3);
		ans.setEditable(false);
		detail1.setEditable(false);
		detail2.setEditable(false);
		detail3.setEditable(false);
		ans.setBounds(0, 0, 300, 30);
		detail1.setBounds(0, 130, 420, 30);
		detail2.setBounds(0, 160, 420, 30);
		detail3.setBounds(0, 190, 420, 30);
		n1.setBounds(0, 30, 60, 25);
		n2.setBounds(60, 30, 60, 25);
		n3.setBounds(120, 30, 60, 25);
		plus.setBounds(180, 30, 60, 25);
		clear.setBounds(240, 30, 60, 25);
		abs.setBounds(300, 30, 60, 25);
		sin.setBounds(360, 30, 60, 25);
		n4.setBounds(0, 55, 60, 25);
		n5.setBounds(60, 55, 60, 25);
		n6.setBounds(120, 55, 60, 25);
		minus.setBounds(180, 55, 60, 25);
		root.setBounds(240, 55, 60, 25);
		square.setBounds(300, 55, 60, 25);
		cos.setBounds(360, 55, 60, 25);
		n7.setBounds(0, 80, 60, 25);
		n8.setBounds(60, 80, 60, 25);
		n9.setBounds(120, 80, 60, 25);
		mult.setBounds(180, 80, 60, 25);
		prp.setBounds(240, 80, 60, 25);
		by.setBounds(300, 80, 60, 25);
		tan.setBounds(360, 80, 60, 25);
		n0.setBounds(0, 105, 60, 25);
		dot.setBounds(60, 105, 60, 25);
		equal.setBounds(120, 105, 60, 25);
		div.setBounds(180, 105, 60, 25);
		adv.setBounds(240, 105, 60, 25);
		fact.setBounds(300, 105, 60, 25);
		log.setBounds(360, 105, 60, 25);
		ans.setText(dis + "");

		n1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (specialfunction3 == 1 || equalevent == 1) {
					reset();
				}
				if (d == 1) {
					num = num + (Math.pow(0.1, n));
					n++;
				} else if (d == 0) {
					if (num == 0) {
						num = num + 1;
					} else {
						num = (num * 10) + 1;
					}
				}
				pe = 0;
				symbolcounter = 0;
				specialfunction = 0;
				ans.setText(dis + "1");
				dis = dis + "1";
			}
		});

		n2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (specialfunction3 == 1 || equalevent == 1) {
					reset();
				}
				if (d == 1) {
					num = num + ((Math.pow(0.1, n)) * 2);
					n++;
				} else if (d == 0) {
					if (num == 0) {
						num = num + 2;
					} else {
						num = (num * 10) + 2;
					}
				}
				pe = 0;
				ans.setText(dis + "2");
				dis = dis + "2";
				symbolcounter = 0;
				specialfunction = 0;
			}
		});

		n3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (specialfunction3 == 1 || equalevent == 1) {
					reset();
				}
				if (d == 1) {
					num = num + ((Math.pow(0.1, n)) * 3);
					n++;
				} else if (d == 0) {
					if (num == 0) {
						num = num + 3;
					} else {
						num = (num * 10) + 3;
					}
				}
				pe = 0;
				ans.setText(dis + "3");
				dis = dis + "3";
				symbolcounter = 0;
				specialfunction = 0;
			}
		});

		n4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (specialfunction3 == 1 || equalevent == 1) {
					reset();
				}
				if (d == 1) {
					num = num + ((Math.pow(0.1, n)) * 4);
					n++;
				} else if (d == 0) {
					if (num == 0) {
						num = num + 4;
					} else {
						num = (num * 10) + 4;
					}
				}
				pe = 0;
				symbolcounter = 0;
				specialfunction = 0;
				ans.setText(dis + "4");
				dis = dis + "4";
			}
		});

		n5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (specialfunction3 == 1 || equalevent == 1) {
					reset();
				}
				if (d == 1) {
					num = num + ((Math.pow(0.1, n)) * 5);
					n++;
				} else if (d == 0) {
					if (num == 0) {
						num = num + 5;
					} else {
						num = (num * 10) + 5;
					}
				}
				pe = 0;
				symbolcounter = 0;
				specialfunction = 0;
				ans.setText(dis + "5");
				dis = dis + "5";
			}
		});

		n6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (specialfunction3 == 1 || equalevent == 1) {
					reset();
				}
				if (d == 1) {
					num = num + ((Math.pow(0.1, n)) * 6);
					n++;
				} else if (d == 0) {
					if (num == 0) {
						num = num + 6;
					} else {
						num = (num * 10) + 6;
					}
				}
				pe = 0;
				symbolcounter = 0;
				specialfunction = 0;
				ans.setText(dis + "6");
				dis = dis + "6";
			}
		});

		n7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (specialfunction3 == 1 || equalevent == 1) {
					reset();
				}
				if (d == 1) {
					num = num + ((Math.pow(0.1, n)) * 7);
					n++;
				} else if (d == 0) {
					if (num == 0) {
						num = num + 7;
					} else {
						num = (num * 10) + 7;
					}
				}
				pe = 0;
				symbolcounter = 0;
				specialfunction = 0;
				ans.setText(dis + "7");
				dis = dis + "7";
			}
		});

		n8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (specialfunction3 == 1 || equalevent == 1) {
					reset();
				}
				if (d == 1) {
					num = num + ((Math.pow(0.1, n)) * 8);
					n++;
				} else if (d == 0) {
					if (num == 0) {
						num = num + 8;
					} else {
						num = (num * 10) + 8;
					}
				}
				pe = 0;
				symbolcounter = 0;
				specialfunction = 0;
				ans.setText(dis + "8");
				dis = dis + "8";
			}
		});

		n9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (specialfunction3 == 1 || equalevent == 1) {
					reset();
				}
				if (d == 1) {
					num = num + ((Math.pow(0.1, n)) * 9);
					n++;
				} else if (d == 0) {
					if (num == 0) {
						num = num + 9;
					} else {
						num = (num * 10) + 9;
					}
				}
				pe = 0;
				symbolcounter = 0;
				specialfunction = 0;
				ans.setText(dis + "9");
				dis = dis + "9";
			}
		});

		n0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (specialfunction3 == 1 || equalevent == 1) {
					reset();
				}
				if (ic == 1) {
					n++;
				} else {
					num = num * 10;
				}
				pe = 0;
				ans.setText(dis + "0");
				dis = dis + "0";
				symbolcounter = 0;
				specialfunction = 0;
			}
		});

		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (specialfunction3 == 1) {
					result = num;
				}
				if (event == 0 && specialfunction == 0 && specialfunction3 == 0) {
					result = result + num;
				} else if (event == 1) {
					result = result + num;
				} else if (event == 2) {
					result = result - num;
				} else if (event == 3) {
					result = result * num;
				} else if (event == 4) {
					result = result / num;
				}
				if (symbolcounter == 1 || dis == " " || dis == "") {
					se = 1;
				}
				pe = 0;
				event = 1;
				num = 0;
				d = 0;
				n = 1;
				symbolcounter = 1;
				ic = 0;
				specialfunction2 = 1;
				ans.setText(dis + "+");
				dis = dis + "+";
				specialfunction3 = 0;
				equalevent = 0;
			}
		});

		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (specialfunction3 == 1) {
					result = num;
				}
				if (event == 0 && specialfunction == 0 && specialfunction3 == 0) {
					result = result + num;
				} else if (event == 1) {
					result = result + num;
				} else if (event == 2) {
					result = result - num;
				} else if (event == 3) {
					result = result * num;
				} else if (event == 4) {
					result = result / num;
				}
				if (symbolcounter == 1 || dis == " " || dis == "") {
					se = 1;
				}
				pe = 0;
				event = 2;
				num = 0;
				d = 0;
				n = 1;
				symbolcounter = 1;
				ic = 0;
				specialfunction2 = 1;
				ans.setText(dis + "-");
				dis = dis + "-";
				specialfunction3 = 0;
				equalevent = 0;
			}
		});

		mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (specialfunction3 == 1) {
					result = num;
				}
				if (event == 0 && specialfunction == 0 && specialfunction3 == 0) {
					result = result + num;
				} else if (event == 1) {
					result = result + num;
				} else if (event == 2) {
					result = result - num;
				} else if (event == 3) {
					result = result * num;
				} else if (event == 4) {
					result = result / num;
				}
				if (symbolcounter == 1 || dis == " " || dis == "") {
					se = 1;
				}
				pe = 0;
				event = 3;
				num = 0;
				d = 0;
				n = 1;
				symbolcounter = 1;
				ic = 0;
				specialfunction2 = 1;
				ans.setText(dis + "*");
				dis = dis + "*";
				specialfunction3 = 0;
				equalevent = 0;
			}
		});

		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (specialfunction3 == 1) {
					result = num;
				}
				if (event == 0 && specialfunction == 0 && specialfunction3 == 0) {
					result = result + num;
				} else if (event == 1) {
					result = result + num;
				} else if (event == 2) {
					result = result - num;
				} else if (event == 3) {
					result = result * num;
				} else if (event == 4) {
					result = result / num;
				}
				if (symbolcounter == 1 || dis == " " || dis == "") {
					se = 1;
				}
				pe = 0;
				event = 4;
				num = 0;
				d = 0;
				n = 1;
				symbolcounter = 1;
				ic = 0;
				specialfunction2 = 1;
				ans.setText(dis + "/");
				dis = dis + "/";
				specialfunction3 = 0;
				equalevent = 0;
			}
		});

		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dis == " ") {
					ans.setText("Enter number first");
					reset();
				}
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (specialfunction == 1 && dis != " ") {
					ans.setText("Illegal Action");
					reset();
					pe = 1;
				}
				if (specialfunction3 == 1 && dis != " ") {
					result = result;
				} else if (se == 0 && symbolcounter == 0 && specialfunction == 0 && dis != " ") {
					if (event == 0 || event == 1) {
						result = result + num;
					} else if (event == 2) {
						result = result - num;
					} else if (event == 3) {
						result = result * num;
					} else if (event == 4) {
						result = result / num;
					}
					event = 0;
					num = 0;
					d = 0;
					n = 1;
					dis = (dis + "=" + result);
					ans.setText(dis);
					specialfunction = 2;
					specialfunction2 = 0;
					equalevent = 1;
				} else if (se == 1 || symbolcounter == 1 && dis != " ") {
					ans.setText("Invalid Input");
					reset();
					pe = 1;
				}
			}
		});

		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (specialfunction3 == 1 || equalevent == 1) {
					ans.setText("Invalid Action");
					reset();
					pe = 1;
				} else if (symbolcounter == 1 || ic == 1 || dis == " ") {
					se = 1;
					ans.setText(dis + ".");
					dis = dis + ".";
					symbolcounter = 1;
				} else if (symbolcounter == 0) {
					ans.setText(dis + ".");
					dis = dis + ".";
					d = 1;
					symbolcounter = 1;
					n = 1;
				}
				ic = 1;
				equalevent = 0;
			}
		});

		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
				}
				if (mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				reset();
				ans.setText(" ");
			}
		});

		root.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (dis == " ") {
					ans.setText("Enter number first");
					reset();
				}
				if (specialfunction == 0 && specialfunction2 == 0 && dis != " ") {
					result = Math.sqrt(num);
					ans.setText(" " + result);
					dis = (" " + result);
					num = result;
					specialfunction3 = 1;
				} else if (specialfunction == 2 && specialfunction2 == 0 && dis != " ") {
					result = Math.sqrt(result);
					ans.setText(" " + result);
					dis = (" " + result);
					num = result;
					specialfunction3 = 1;
				} else if (specialfunction == 1 || specialfunction2 == 1 && dis != " ") {
					ans.setText("Invalid Input");
					reset();
					pe = 1;
				}
				if (se == 1 || symbolcounter == 1 || se == 1 || symbolcounter == 1 || pe == 1 && dis != " ") {
					ans.setText("Invalid Input");
					reset();
					pe = 1;
				}
				equalevent = 0;
			}
		});

		square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (dis == " ") {
					ans.setText("Enter number first");
					reset();
				}
				if (specialfunction == 0 && specialfunction2 == 0 && dis != " ") {
					result = (num * num);
					num = result;
					ans.setText(" " + result);
					dis = (" " + result);
					specialfunction3 = 1;
				} else if (specialfunction == 2 && specialfunction2 == 0 && dis != " ") {
					result = (result * result);
					ans.setText("" + result);
					dis = (" " + result);
					num = result;
					specialfunction3 = 1;
				}
				if (specialfunction == 1 || specialfunction2 == 1 || se == 1 || symbolcounter == 1 || pe == 1 && dis != " ") {
					ans.setText("Invalid Input");
					reset();
					pe = 1;
				}
				equalevent = 0;
			}
		});

		by.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (dis == " ") {
					ans.setText("Enter number first");
					reset();
				}
				if (specialfunction == 0 && specialfunction2 == 0 && dis != " ") {
					result = (1 / num);
					num = result;
					ans.setText(" " + result);
					dis = (" " + result);
					specialfunction3 = 1;
				} else if (specialfunction == 2 && specialfunction2 == 0 && dis != " ") {
					result = (1 / result);
					ans.setText("" + result);
					dis = (" " + result);
					num = result;
					specialfunction3 = 1;
				}
				if (specialfunction == 1 || specialfunction2 == 1 || se == 1 || symbolcounter == 1 || pe == 1 && dis != " ") {
					ans.setText("Invalid Input");
					reset();
					pe = 1;
				}
				equalevent = 0;
			}
		});

		abs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (dis == " ") {
					ans.setText("Enter number first");
					reset();
				}
				if (specialfunction == 0 && specialfunction2 == 0 && dis != " ") {
					result = Math.abs(num);
					num = result;
					ans.setText(" " + result);
					dis = (" " + result);
					specialfunction3 = 1;
				} else if (specialfunction == 2 && specialfunction2 == 0 && dis != " ") {
					result = Math.abs(result);
					ans.setText("" + result);
					dis = (" " + result);
					num = result;
					specialfunction3 = 1;
				}
				if (specialfunction == 1 || specialfunction2 == 1 || se == 1 || symbolcounter == 1 || pe == 1 && dis != " ") {
					ans.setText("Invalid Input");
					reset();
					pe = 1;
				}
				equalevent = 0;
			}
		});

		sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (dis == " ") {
					ans.setText("Enter number first");
					reset();
				}
				if (specialfunction == 0 && specialfunction2 == 0 && dis != " ") {
					result = Math.sin(num);
					num = result;
					ans.setText(" " + result);
					dis = (" " + result);
					specialfunction3 = 1;
				} else if (specialfunction == 2 && specialfunction2 == 0 && dis != " ") {
					result = Math.sin(result);
					ans.setText("" + result);
					dis = (" " + result);
					num = result;
					specialfunction3 = 1;
				}
				if (specialfunction == 1 || specialfunction2 == 1 || se == 1 || symbolcounter == 1 || pe == 1 && dis != " ") {
					ans.setText("Invalid Input");
					reset();
					pe = 1;
				}
				equalevent = 0;
			}
		});

		cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (dis == " ") {
					ans.setText("Enter number first");
					reset();
				}
				if (specialfunction == 0 && specialfunction2 == 0 && dis != " ") {
					result = Math.cos(num);
					num = result;
					ans.setText(" " + result);
					dis = (" " + result);
					specialfunction3 = 1;
				} else if (specialfunction == 2 && specialfunction2 == 0 && dis != " ") {
					result = Math.cos(result);
					ans.setText("" + result);
					dis = (" " + result);
					num = result;
					specialfunction3 = 1;
				}
				if (specialfunction == 1 || specialfunction2 == 1 || se == 1 || symbolcounter == 1 || pe == 1 && dis != " ") {
					ans.setText("Invalid Input");
					reset();
					pe = 1;
				}
				equalevent = 0;
			}
		});

		tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (dis == " ") {
					ans.setText("Enter number first");
					reset();
				}
				if (specialfunction == 0 && specialfunction2 == 0 && dis != " ") {
					result = Math.tan(num);
					num = result;
					ans.setText(" " + result);
					dis = (" " + result);
					specialfunction3 = 1;
				} else if (specialfunction == 2 && specialfunction2 == 0 && dis != " ") {
					result = Math.tan(result);
					ans.setText("" + result);
					dis = (" " + result);
					num = result;
					specialfunction3 = 1;
				}
				if (specialfunction == 1 || specialfunction2 == 1 || se == 1 || symbolcounter == 1 || pe == 1 && dis != " ") {
					ans.setText("Invalid Input");
					reset();
					pe = 1;
				}
				equalevent = 0;
			}
		});

		log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (dis == " ") {
					ans.setText("Enter number first");
					reset();
				}
				if (specialfunction == 0 && specialfunction2 == 0 && dis != " ") {
					result = Math.log(num);
					num = result;
					ans.setText(" " + result);
					dis = (" " + result);
					specialfunction3 = 1;
				} else if (specialfunction == 2 && specialfunction2 == 0 && dis != " ") {
					result = Math.log(result);
					ans.setText("" + result);
					dis = (" " + result);
					num = result;
					specialfunction3 = 1;
				}
				if (specialfunction == 1 || specialfunction2 == 1 || se == 1 || symbolcounter == 1 || pe == 1 && dis != " ") {
					ans.setText("Invalid Input");
					reset();
					pe = 1;
				}
				equalevent = 0;
			}
		});


		fact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pevent == 1 && mode == 0) {
					resize(305, 157);
					ans.setBounds(0, 0, 300, 30);
					ans.setText(dis);
				}
				if (pevent == 1 && mode == 1) {
					resize(425, 157);
					ans.setBounds(0, 0, 420, 30);
				}
				if (dis == " ") {
					ans.setText("Enter number first");
					reset();
				}
				if (specialfunction == 0 && specialfunction2 == 0 && dis != " ") {
					if (num % 1 == 0) {
						result = 1;
						for (int i = 1; i <= num; i++) {
							result = result * i;
						}
						num = result;
						ans.setText(" " + result);
						dis = (" " + result);
						specialfunction3 = 1;
					} else {
						ans.setText("Error Occured");
						reset();
						pe = 1;
					}
				} else if (specialfunction == 2 && specialfunction2 == 0 && dis != " ") {
					if (result % 1 == 0) {
						num = 1;
						for (int i = 1; i <= result; i++) {
							num = num * i;
						}
						result = num;
						ans.setText("" + result);
						dis = (" " + result);
						specialfunction3 = 1;
					} else {
						ans.setText("Error Occured");
						reset();
					}
				}
				if (specialfunction == 1 || specialfunction2 == 1 || se == 1 || symbolcounter == 1 || pe == 1 && dis != " ") {
					ans.setText("Invalid Input");
					reset();
					pe = 1;
				}
				equalevent = 0;
			}
		});

		adv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				basic.setBounds(240, 105, 60, 25);
				resize(425, 157);
				adv.setBounds(1000, 1000, 60, 25);
				mode = 1;
				ans.setBounds(0, 0, 420, 30);
			}
		});
		basic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adv.setBounds(240, 105, 60, 25);
				resize(305, 157);
				basic.setBounds(1000, 1000, 60, 25);
				mode = 0;
				ans.setBounds(0, 0, 300, 30);
				ans.setText(dis);
			}
		});

		prp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					if (specialfunction == 0 && specialfunction2 == 0 && pe != 1) {
						{
							if (mode == 0) {
								resize(305, 247);
								ans.setBounds(0, 0, 300, 30);
								ans.setText(dis);
							} else if (mode == 1) {
								resize(425, 247);
								ans.setBounds(0, 0, 420, 30);
							}
						}
						properties(num);
						specialfunction3 = 1;
					} else if (specialfunction == 2 && specialfunction2 == 0 && pe != 1) {
						{
							if (mode == 0) {
								resize(305, 247);
							} else if (mode == 1) {
								resize(425, 247);
							}
						}
						properties(result);
						specialfunction3 = 1;
					}
				}
				if (specialfunction == 1 || specialfunction2 == 1 || se == 1 || symbolcounter == 1 || pe == 1) {
					ans.setText("Invalid Input");
					if (mode == 0) {
						resize(305, 157);
					}
					if (mode == 1) {
						resize(425, 157);
					}
					reset();
					pe = 1;
				}
				if (dis == " ") {
					ans.setText("Enter number first");
					if (mode == 0) {
						resize(305, 157);
					}
					if (mode == 1) {
						resize(425, 157);
					}
					reset();
					pe = 1;
				}
				equalevent = 0;
				pevent = 1;
			}
		});
		window.setLocation(300, 300);
		window.setTitle("CALCULATOR");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
