.class public final Lf4/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/S0;


# instance fields
.field private final a:Lf4/W0;

.field private final b:Lf4/W0;

.field private final c:Lf4/W0;


# direct methods
.method public constructor <init>(Lf4/W0;Lf4/W0;Lf4/W0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/d1;->a:Lf4/W0;

    iput-object p2, p0, Lf4/d1;->b:Lf4/W0;

    iput-object p3, p0, Lf4/d1;->c:Lf4/W0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lf4/d1;->a:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf4/q;

    iget-object v1, p0, Lf4/d1;->b:Lf4/W0;

    check-cast v1, Lf4/q1;

    invoke-virtual {v1}, Lf4/q1;->b()Lf4/p1;

    move-result-object v1

    iget-object v2, p0, Lf4/d1;->c:Lf4/W0;

    invoke-interface {v2}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf4/P;

    new-instance v3, Lf4/c1;

    invoke-direct {v3, v0, v1, v2}, Lf4/c1;-><init>(Lf4/q;Lf4/p1;Lf4/P;)V

    return-object v3
.end method
