.class public interface abstract Ld/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld/a$b;,
        Ld/a$a;
    }
.end annotation


# static fields
.field public static final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x24

    const/16 v1, 0x2e

    const-string v2, "android$support$customtabs$ICustomTabsCallback"

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ld/a;->w:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract C4(Landroid/os/Bundle;)V
.end method

.method public abstract M5(Landroid/os/Bundle;)V
.end method

.method public abstract Q3(IILandroid/os/Bundle;)V
.end method

.method public abstract R4(ILandroid/os/Bundle;)V
.end method

.method public abstract R5(ILandroid/net/Uri;ZLandroid/os/Bundle;)V
.end method

.method public abstract i3(Landroid/os/Bundle;)V
.end method

.method public abstract m2(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
.end method

.method public abstract q4(Ljava/lang/String;Landroid/os/Bundle;)V
.end method

.method public abstract s1(IIIIILandroid/os/Bundle;)V
.end method

.method public abstract w3(Landroid/os/Bundle;)V
.end method

.method public abstract y5(Ljava/lang/String;Landroid/os/Bundle;)V
.end method
