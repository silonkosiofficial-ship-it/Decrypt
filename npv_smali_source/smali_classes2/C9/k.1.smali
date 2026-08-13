.class public final LC9/k;
.super Landroidx/lifecycle/T;
.source "SourceFile"

# interfaces
.implements LC9/Q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC9/k$b;
    }
.end annotation


# static fields
.field public static final c:LC9/k$b;

.field public static final d:I

.field private static final e:Landroidx/lifecycle/V$c;


# instance fields
.field private final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LC9/k$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LC9/k$b;-><init>(Ly7/k;)V

    sput-object v0, LC9/k;->c:LC9/k$b;

    const/16 v0, 0x8

    sput v0, LC9/k;->d:I

    new-instance v0, LC9/k$a;

    invoke-direct {v0}, LC9/k$a;-><init>()V

    sput-object v0, LC9/k;->e:Landroidx/lifecycle/V$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/lifecycle/T;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LC9/k;->b:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic h()Landroidx/lifecycle/V$c;
    .locals 1

    sget-object v0, LC9/k;->e:Landroidx/lifecycle/V$c;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    const-string v0, "backStackEntryId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LC9/k;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/X;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/lifecycle/X;->a()V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)Landroidx/lifecycle/X;
    .locals 2

    .prologue
    const-string v0, "backStackEntryId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LC9/k;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/X;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/X;

    invoke-direct {v0}, Landroidx/lifecycle/X;-><init>()V

    iget-object v1, p0, LC9/k;->b:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method protected g()V
    .locals 2

    .prologue
    iget-object v0, p0, LC9/k;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/X;

    invoke-virtual {v1}, Landroidx/lifecycle/X;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LC9/k;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method
