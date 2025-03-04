package mirror.android.content.pm;

import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageParser;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.util.DisplayMetrics;
import java.io.File;
import mirror.MethodParams;
import mirror.MethodReflectParams;
import mirror.RefClass;
import mirror.RefConstructor;
import mirror.RefMethod;
import mirror.RefStaticMethod;

public class PackageParserJellyBean17 {
  public static Class<?> TYPE = RefClass.load(PackageParserJellyBean17.class, "android.content.pm.PackageParser");
  
  @MethodReflectParams({"android.content.pm.PackageParser$Package", "int"})
  public static RefMethod<Void> collectCertificates;
  
  @MethodParams({String.class})
  public static RefConstructor<PackageParser> ctor;
  
  @MethodReflectParams({"android.content.pm.PackageParser$Activity", "int", "android.content.pm.PackageUserState", "int"})
  public static RefStaticMethod<ActivityInfo> generateActivityInfo;
  
  @MethodReflectParams({"android.content.pm.PackageParser$Package", "int", "android.content.pm.PackageUserState"})
  public static RefStaticMethod<ApplicationInfo> generateApplicationInfo;
  
  @MethodReflectParams({"android.content.pm.PackageParser$Package", "[I", "int", "long", "long", "java.util.HashSet", "android.content.pm.PackageUserState"})
  public static RefStaticMethod<PackageInfo> generatePackageInfo;
  
  @MethodReflectParams({"android.content.pm.PackageParser$Provider", "int", "android.content.pm.PackageUserState", "int"})
  public static RefStaticMethod<ProviderInfo> generateProviderInfo;
  
  @MethodReflectParams({"android.content.pm.PackageParser$Service", "int", "android.content.pm.PackageUserState", "int"})
  public static RefStaticMethod<ServiceInfo> generateServiceInfo;
  
  @MethodParams({File.class, String.class, DisplayMetrics.class, int.class})
  public static RefMethod<PackageParser.Package> parsePackage;
}


/* Location:              F:\何章易\项目文件夹\项目24\va\classes_merge.jar!\mirror\android\content\pm\PackageParserJellyBean17.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */