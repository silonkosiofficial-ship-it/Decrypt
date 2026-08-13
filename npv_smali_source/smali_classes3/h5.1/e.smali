.class public final Lh5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ5/f;


# instance fields
.field private final a:Lm5/n;


# direct methods
.method public constructor <init>(Lm5/n;)V
    .locals 1

    const-string v0, "userMetadata"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh5/e;->a:Lm5/n;

    return-void
.end method


# virtual methods
.method public a(LQ5/e;)V
    .locals 9

    .prologue
    const-string v0, "rolloutsState"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh5/e;->a:Lm5/n;

    invoke-virtual {p1}, LQ5/e;->b()Ljava/util/Set;

    move-result-object p1

    const-string v1, "rolloutsState.rolloutAssignments"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LQ5/d;

    invoke-virtual {v2}, LQ5/d;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, LQ5/d;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, LQ5/d;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, LQ5/d;->f()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, LQ5/d;->e()J

    move-result-wide v7

    invoke-static/range {v3 .. v8}, Lm5/i;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lm5/i;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lm5/n;->p(Ljava/util/List;)Z

    invoke-static {}, Lh5/g;->f()Lh5/g;

    move-result-object p1

    const-string v0, "Updated Crashlytics Rollout State"

    invoke-virtual {p1, v0}, Lh5/g;->b(Ljava/lang/String;)V

    return-void
.end method
