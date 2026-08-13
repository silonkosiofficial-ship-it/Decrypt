.class public final Lorg/chromium/support_lib_boundary/ProcessGlobalConfigConstants;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/support_lib_boundary/ProcessGlobalConfigConstants$ProcessGlobalConfigMapKey;
    }
.end annotation


# static fields
.field public static final CACHE_DIRECTORY_BASE_PATH:Ljava/lang/String;

.field public static final DATA_DIRECTORY_BASE_PATH:Ljava/lang/String;

.field public static final DATA_DIRECTORY_SUFFIX:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "DATA_DIRECTORY_BASE_PATH"

    sput-object v0, Lorg/chromium/support_lib_boundary/ProcessGlobalConfigConstants;->DATA_DIRECTORY_BASE_PATH:Ljava/lang/String;

    const-string v0, "CACHE_DIRECTORY_BASE_PATH"

    sput-object v0, Lorg/chromium/support_lib_boundary/ProcessGlobalConfigConstants;->CACHE_DIRECTORY_BASE_PATH:Ljava/lang/String;

    const-string v0, "DATA_DIRECTORY_SUFFIX"

    sput-object v0, Lorg/chromium/support_lib_boundary/ProcessGlobalConfigConstants;->DATA_DIRECTORY_SUFFIX:Ljava/lang/String;

    return-void
.end method
