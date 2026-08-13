.class final LD/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/g;
.implements Le0/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD/F$b;
    }
.end annotation


# static fields
.field public static final d:LD/F$b;


# instance fields
.field private final a:Le0/g;

.field private final b:LV/w0;

.field private final c:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LD/F$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LD/F$b;-><init>(Ly7/k;)V

    sput-object v0, LD/F;->d:LD/F$b;

    return-void
.end method

.method public constructor <init>(Le0/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD/F;->a:Le0/g;

    const/4 p1, 0x0

    const/4 v0, 0x2

    invoke-static {p1, p1, v0, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LD/F;->b:LV/w0;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, LD/F;->c:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Le0/g;Ljava/util/Map;)V
    .locals 1

    new-instance v0, LD/F$a;

    invoke-direct {v0, p1}, LD/F$a;-><init>(Le0/g;)V

    invoke-static {p2, v0}, Le0/i;->a(Ljava/util/Map;Lx7/l;)Le0/g;

    move-result-object p1

    invoke-direct {p0, p1}, LD/F;-><init>(Le0/g;)V

    return-void
.end method

.method public static final synthetic g(LD/F;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, LD/F;->c:Ljava/util/Set;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LD/F;->a:Le0/g;

    invoke-interface {v0, p1}, Le0/g;->a(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public b()Ljava/util/Map;
    .locals 3

    .prologue
    invoke-virtual {p0}, LD/F;->h()Le0/d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LD/F;->c:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Le0/d;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LD/F;->a:Le0/g;

    invoke-interface {v0}, Le0/g;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LD/F;->a:Le0/g;

    invoke-interface {v0, p1}, Le0/g;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/Object;Lx7/p;LV/n;I)V
    .locals 4

    .prologue
    const v0, -0x298e20f1

    invoke-interface {p3, v0}, LV/n;->r(I)LV/n;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_3

    invoke-interface {p3, p2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_5

    invoke-interface {p3, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x93

    const/16 v3, 0x92

    if-ne v2, v3, :cond_7

    invoke-interface {p3}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LV/n;->A()V

    goto :goto_5

    :cond_7
    :goto_4
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:82)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_8
    invoke-virtual {p0}, LD/F;->h()Le0/d;

    move-result-object v0

    if-eqz v0, :cond_d

    and-int/lit8 v2, v1, 0xe

    and-int/lit8 v1, v1, 0x7e

    invoke-interface {v0, p1, p2, p3, v1}, Le0/d;->d(Ljava/lang/Object;Lx7/p;LV/n;I)V

    invoke-interface {p3, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p3, p1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_9

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_a

    :cond_9
    new-instance v1, LD/F$c;

    invoke-direct {v1, p0, p1}, LD/F$c;-><init>(LD/F;Ljava/lang/Object;)V

    invoke-interface {p3, v1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v1, Lx7/l;

    invoke-static {p1, v1, p3, v2}, LV/Q;->b(Ljava/lang/Object;Lx7/l;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LV/q;->P()V

    :cond_b
    :goto_5
    invoke-interface {p3}, LV/n;->x()LV/e1;

    move-result-object p3

    if-eqz p3, :cond_c

    new-instance v0, LD/F$d;

    invoke-direct {v0, p0, p1, p2, p4}, LD/F$d;-><init>(LD/F;Ljava/lang/Object;Lx7/p;I)V

    invoke-interface {p3, v0}, LV/e1;->a(Lx7/p;)V

    :cond_c
    return-void

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "null wrappedHolder"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Ljava/lang/String;Lx7/a;)Le0/g$a;
    .locals 1

    iget-object v0, p0, LD/F;->a:Le0/g;

    invoke-interface {v0, p1, p2}, Le0/g;->e(Ljava/lang/String;Lx7/a;)Le0/g$a;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/Object;)V
    .locals 1

    .prologue
    invoke-virtual {p0}, LD/F;->h()Le0/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Le0/d;->f(Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "null wrappedHolder"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h()Le0/d;
    .locals 1

    iget-object v0, p0, LD/F;->b:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le0/d;

    return-object v0
.end method

.method public final i(Le0/d;)V
    .locals 1

    iget-object v0, p0, LD/F;->b:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
