.class public Lcom/google/android/gms/dynamite/descriptors/com/google/android/gms/ads/dynamite/ModuleDescriptor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/util/DynamiteApi;
.end annotation


# static fields
.field public static final MODULE_ID:Ljava/lang/String;

.field public static final MODULE_VERSION:I = 0xe91675b


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.dynamite"

    sput-object v0, Lcom/google/android/gms/dynamite/descriptors/com/google/android/gms/ads/dynamite/ModuleDescriptor;->MODULE_ID:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
