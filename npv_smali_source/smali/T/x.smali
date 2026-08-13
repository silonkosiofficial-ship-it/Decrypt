.class public abstract LT/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT/x$a;
    }
.end annotation


# static fields
.field public static final a:LT/x$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LT/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LT/x$a;-><init>(Ly7/k;)V

    sput-object v0, LT/x;->a:LT/x$a;

    return-void
.end method

.method public static a(I)I
    .locals 0

    return p0
.end method
