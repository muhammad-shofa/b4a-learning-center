package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class about_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (about) ","about",2,about.mostCurrent.activityBA,about.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.about.remoteMe.runUserSub(false, "about","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"AboutUI\")";
Debug.ShouldStop(2097152);
about.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("AboutUI")),about.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Activity_Pause (about) ","about",2,about.mostCurrent.activityBA,about.mostCurrent,29);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.about.remoteMe.runUserSub(false, "about","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Activity_Resume (about) ","about",2,about.mostCurrent.activityBA,about.mostCurrent,25);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.about.remoteMe.runUserSub(false, "about","activity_resume");}
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("BtnToAbout1_Click (about) ","about",2,about.mostCurrent.activityBA,about.mostCurrent,37);
if (RapidSub.canDelegate("btntoabout1_click")) { return b4a.example.about.remoteMe.runUserSub(false, "about","btntoabout1_click");}
 BA.debugLineNum = 37;BA.debugLine="Sub BtnToAbout1_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="StartActivity(\"About\")";
Debug.ShouldStop(32);
about.mostCurrent.__c.runVoidMethod ("StartActivity",about.processBA,(Object)((RemoteObject.createImmutable("About"))));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("BtnToHome1_Click (about) ","about",2,about.mostCurrent.activityBA,about.mostCurrent,33);
if (RapidSub.canDelegate("btntohome1_click")) { return b4a.example.about.remoteMe.runUserSub(false, "about","btntohome1_click");}
 BA.debugLineNum = 33;BA.debugLine="Sub BtnToHome1_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="StartActivity(\"Main\")";
Debug.ShouldStop(2);
about.mostCurrent.__c.runVoidMethod ("StartActivity",about.processBA,(Object)((RemoteObject.createImmutable("Main"))));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}