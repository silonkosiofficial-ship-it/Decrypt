.class public abstract LK/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK/z0$a;
    }
.end annotation


# static fields
.field private static final a:LK/z0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LK/z0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LK/z0$a;-><init>(Ly7/k;)V

    sput-object v0, LK/z0;->a:LK/z0$a;

    return-void
.end method

.method public static final synthetic a(LK/z0;)LJ/a;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public static final synthetic b(LK/z0;)LJ/c;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public static synthetic c(LK/z0;Ljava/lang/CharSequence;JLL/a;ZILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p0, p6, 0x4

    if-eqz p0, :cond_0

    sget-object p0, LL/a;->C:LL/a;

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method
