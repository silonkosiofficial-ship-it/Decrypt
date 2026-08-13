.class final Le0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le0/e$c;,
        Le0/e$d;
    }
.end annotation


# static fields
.field public static final d:Le0/e$c;

.field private static final e:Le0/j;


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/util/Map;

.field private c:Le0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le0/e$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le0/e$c;-><init>(Ly7/k;)V

    sput-object v0, Le0/e;->d:Le0/e$c;

    sget-object v0, Le0/e$a;->D:Le0/e$a;

    sget-object v1, Le0/e$b;->D:Le0/e$b;

    invoke-static {v0, v1}, Le0/k;->a(Lx7/p;Lx7/l;)Le0/j;

    move-result-object v0

    sput-object v0, Le0/e;->e:Le0/j;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le0/e;->a:Ljava/util/Map;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Le0/e;->b:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    :cond_0
    invoke-direct {p0, p1}, Le0/e;-><init>(Ljava/util/Map;)V

    return-void
.end method

.method public static final synthetic a(Le0/e;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Le0/e;->b:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic b(Le0/e;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Le0/e;->a:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic c()Le0/j;
    .locals 1

    sget-object v0, Le0/e;->e:Le0/j;

    return-object v0
.end method

.method public static final synthetic e(Le0/e;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0}, Le0/e;->h()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private final h()Ljava/util/Map;
    .locals 3

    .prologue
    iget-object v0, p0, Le0/e;->a:Ljava/util/Map;

    invoke-static {v0}, Lj7/S;->u(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Le0/e;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le0/e$d;

    invoke-virtual {v2, v0}, Le0/e$d;->b(Ljava/util/Map;)V

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public d(Ljava/lang/Object;Lx7/p;LV/n;I)V
    .locals 5

    .prologue
    const v0, -0x47703d6d

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

    goto/16 :goto_7

    :cond_7
    :goto_4
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v3, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:75)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_8
    const/16 v0, 0xcf

    invoke-interface {p3, v0, p1}, LV/n;->w(ILjava/lang/Object;)V

    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_b

    iget-object v0, p0, Le0/e;->c:Le0/g;

    if-eqz v0, :cond_9

    invoke-interface {v0, p1}, Le0/g;->a(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_5

    :cond_9
    const/4 v0, 0x1

    :goto_5
    if-eqz v0, :cond_a

    new-instance v0, Le0/e$d;

    invoke-direct {v0, p0, p1}, Le0/e$d;-><init>(Le0/e;Ljava/lang/Object;)V

    invoke-interface {p3, v0}, LV/n;->K(Ljava/lang/Object;)V

    goto :goto_6

    :cond_a
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Type of the key "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not supported. On Android you can only use types which can be stored inside the Bundle."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_b
    :goto_6
    check-cast v0, Le0/e$d;

    invoke-static {}, Le0/i;->d()LV/O0;

    move-result-object v3

    invoke-virtual {v0}, Le0/e$d;->a()Le0/g;

    move-result-object v4

    invoke-virtual {v3, v4}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v3

    sget v4, LV/P0;->i:I

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v4

    invoke-static {v3, p2, p3, v1}, LV/y;->a(LV/P0;Lx7/p;LV/n;I)V

    sget-object v1, Li7/M;->a:Li7/M;

    invoke-interface {p3, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p3, p1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {p3, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_c

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_d

    :cond_c
    new-instance v4, Le0/e$e;

    invoke-direct {v4, p0, p1, v0}, Le0/e$e;-><init>(Le0/e;Ljava/lang/Object;Le0/e$d;)V

    invoke-interface {p3, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v4, Lx7/l;

    const/4 v0, 0x6

    invoke-static {v1, v4, p3, v0}, LV/Q;->b(Ljava/lang/Object;Lx7/l;LV/n;I)V

    invoke-interface {p3}, LV/n;->e()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, LV/q;->P()V

    :cond_e
    :goto_7
    invoke-interface {p3}, LV/n;->x()LV/e1;

    move-result-object p3

    if-eqz p3, :cond_f

    new-instance v0, Le0/e$f;

    invoke-direct {v0, p0, p1, p2, p4}, Le0/e$f;-><init>(Le0/e;Ljava/lang/Object;Lx7/p;I)V

    invoke-interface {p3, v0}, LV/e1;->a(Lx7/p;)V

    :cond_f
    return-void
.end method

.method public f(Ljava/lang/Object;)V
    .locals 1

    .prologue
    iget-object v0, p0, Le0/e;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le0/e$d;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Le0/e$d;->c(Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le0/e;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public final g()Le0/g;
    .locals 1

    iget-object v0, p0, Le0/e;->c:Le0/g;

    return-object v0
.end method

.method public final i(Le0/g;)V
    .locals 0

    iput-object p1, p0, Le0/e;->c:Le0/g;

    return-void
.end method
