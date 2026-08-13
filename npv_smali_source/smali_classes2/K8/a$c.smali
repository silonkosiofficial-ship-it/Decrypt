.class final LK8/a$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK8/a;->z(LF8/E;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LK8/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LK8/a$c;

    invoke-direct {v0}, LK8/a$c;-><init>()V

    sput-object v0, LK8/a$c;->D:LK8/a$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF8/t0;)Ljava/lang/Boolean;
    .locals 2

    .prologue
    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object p1

    invoke-interface {p1}, LF8/e0;->w()LO7/h;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    instance-of v1, p1, LO7/e0;

    if-nez v1, :cond_0

    instance-of p1, p1, LO7/f0;

    if-eqz p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF8/t0;

    invoke-virtual {p0, p1}, LK8/a$c;->a(LF8/t0;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
