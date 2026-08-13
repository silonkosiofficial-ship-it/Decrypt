.class final LF0/d0$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LF0/d0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF0/d0$c;

    invoke-direct {v0}, LF0/d0$c;-><init>()V

    sput-object v0, LF0/d0$c;->D:LF0/d0$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/d0;)V
    .locals 0

    .prologue
    invoke-virtual {p1}, LF0/d0;->i2()LF0/m0;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, LF0/m0;->invalidate()V

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/d0;

    invoke-virtual {p0, p1}, LF0/d0$c;->a(LF0/d0;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
