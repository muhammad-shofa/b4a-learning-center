package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class about_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (about) ","about",2,about.mostCurrent.activityBA,about.mostCurrent,23);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.about.remoteMe.runUserSub(false, "about","activity_create", _firsttime);}
RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
RemoteObject _lblcontenthsv = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 23;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Activity.LoadLayout(\"AboutUI\")";
Debug.ShouldStop(8388608);
about.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("AboutUI")),about.mostCurrent.activityBA);
 BA.debugLineNum = 27;BA.debugLine="Dim Panel1 As Panel";
Debug.ShouldStop(67108864);
_panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("Panel1", _panel1);
 BA.debugLineNum = 28;BA.debugLine="Panel1.Initialize(\"\")";
Debug.ShouldStop(134217728);
_panel1.runVoidMethod ("Initialize",about.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 29;BA.debugLine="HZ_ScrollView1.Panel.AddView(Panel1, 0, 0, 600dip";
Debug.ShouldStop(268435456);
about.mostCurrent._hz_scrollview1.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_panel1.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(about.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600)))),(Object)(about.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 BA.debugLineNum = 32;BA.debugLine="For i = 0 To 4";
Debug.ShouldStop(-2147483648);
{
final int step5 = 1;
final int limit5 = 4;
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 33;BA.debugLine="Dim LblContentHSV As Label";
Debug.ShouldStop(1);
_lblcontenthsv = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("LblContentHSV", _lblcontenthsv);
 BA.debugLineNum = 34;BA.debugLine="LblContentHSV.Initialize(\"\")";
Debug.ShouldStop(2);
_lblcontenthsv.runVoidMethod ("Initialize",about.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 35;BA.debugLine="LblContentHSV.Text = \"Halo\" & (i + 1)";
Debug.ShouldStop(4);
_lblcontenthsv.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Halo"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)))));
 BA.debugLineNum = 36;BA.debugLine="LblContentHSV.TextColor = Colors.Black";
Debug.ShouldStop(8);
_lblcontenthsv.runMethod(true,"setTextColor",about.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 39;BA.debugLine="Panel1.AddView(LblContentHSV, i * 100dip, 0, 100";
Debug.ShouldStop(64);
_panel1.runVoidMethod ("AddView",(Object)((_lblcontenthsv.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),about.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))}, "*",0, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(about.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(about.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 43;BA.debugLine="HZ_ScrollView1.Panel.Width = 600dip";
Debug.ShouldStop(1024);
about.mostCurrent._hz_scrollview1.runMethod(false,"getPanel").runMethod(true,"setWidth",about.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600))));
 BA.debugLineNum = 44;BA.debugLine="HZ_ScrollView1.Panel.Height = 100dip";
Debug.ShouldStop(2048);
about.mostCurrent._hz_scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",about.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (about) ","about",2,about.mostCurrent.activityBA,about.mostCurrent,51);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.about.remoteMe.runUserSub(false, "about","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 51;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (about) ","about",2,about.mostCurrent.activityBA,about.mostCurrent,47);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.about.remoteMe.runUserSub(false, "about","activity_resume");}
 BA.debugLineNum = 47;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btntoabout1_click() throws Exception{
try {
		Debug.PushSubsStack("BtnToAbout1_Click (about) ","about",2,about.mostCurrent.activityBA,about.mostCurrent,59);
if (RapidSub.canDelegate("btntoabout1_click")) { return b4a.example.about.remoteMe.runUserSub(false, "about","btntoabout1_click");}
 BA.debugLineNum = 59;BA.debugLine="Sub BtnToAbout1_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="StartActivity(\"About\")";
Debug.ShouldStop(134217728);
about.mostCurrent.__c.runVoidMethod ("StartActivity",about.processBA,(Object)((RemoteObject.createImmutable("About"))));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btntohome1_click() throws Exception{
try {
		Debug.PushSubsStack("BtnToHome1_Click (about) ","about",2,about.mostCurrent.activityBA,about.mostCurrent,55);
if (RapidSub.canDelegate("btntohome1_click")) { return b4a.example.about.remoteMe.runUserSub(false, "about","btntohome1_click");}
 BA.debugLineNum = 55;BA.debugLine="Sub BtnToHome1_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="StartActivity(\"Main\")";
Debug.ShouldStop(8388608);
about.mostCurrent.__c.runVoidMethod ("StartActivity",about.processBA,(Object)((RemoteObject.createImmutable("Main"))));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private LblAbout1 As Label";
about.mostCurrent._lblabout1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private BtnToAbout1 As Button";
about.mostCurrent._btntoabout1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private BtnToHome1 As Button";
about.mostCurrent._btntohome1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private EditText1 As EditText";
about.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private HZ_ScrollView1 As HorizontalScrollView";
about.mostCurrent._hz_scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}