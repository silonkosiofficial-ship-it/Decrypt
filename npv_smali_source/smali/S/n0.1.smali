.class abstract LS/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS/n0$a;
    }
.end annotation


# static fields
.field public static final a:LS/n0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS/n0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS/n0$a;-><init>(Ly7/k;)V

    sput-object v0, LS/n0;->a:LS/n0$a;

    return-void
.end method
