.class final LX7/H$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX7/H;->e(LO7/b;)LO7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LX7/H$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LX7/H$c;

    invoke-direct {v0}, LX7/H$c;-><init>()V

    sput-object v0, LX7/H$c;->D:LX7/H$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/b;)Ljava/lang/Boolean;
    .locals 1

    .prologue
    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LL7/g;->g0(LO7/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, LX7/f;->m(LO7/b;)LX7/I$b;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/b;

    invoke-virtual {p0, p1}, LX7/H$c;->a(LO7/b;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
