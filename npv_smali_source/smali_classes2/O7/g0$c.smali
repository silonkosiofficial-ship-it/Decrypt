.class final LO7/g0$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO7/g0;->d(LO7/i;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final D:LO7/g0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LO7/g0$c;

    invoke-direct {v0}, LO7/g0$c;-><init>()V

    sput-object v0, LO7/g0$c;->D:LO7/g0$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/m;)LR8/h;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LO7/a;

    invoke-interface {p1}, LO7/a;->g()Ljava/util/List;

    move-result-object p1

    const-string v0, "getTypeParameters(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/v;->Y(Ljava/lang/Iterable;)LR8/h;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/m;

    invoke-virtual {p0, p1}, LO7/g0$c;->a(LO7/m;)LR8/h;

    move-result-object p1

    return-object p1
.end method
