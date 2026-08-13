.class public final Lf4/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/S0;


# instance fields
.field private final a:Lf4/W0;

.field private final b:Lf4/W0;

.field private final c:Lf4/W0;

.field private final d:Lf4/W0;

.field private final e:Lf4/W0;

.field private final f:Lf4/W0;


# direct methods
.method public constructor <init>(Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;Lf4/W0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/E;->a:Lf4/W0;

    iput-object p2, p0, Lf4/E;->b:Lf4/W0;

    iput-object p3, p0, Lf4/E;->c:Lf4/W0;

    iput-object p4, p0, Lf4/E;->d:Lf4/W0;

    iput-object p5, p0, Lf4/E;->e:Lf4/W0;

    iput-object p6, p0, Lf4/E;->f:Lf4/W0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lf4/E;->a:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/app/Application;

    iget-object v0, p0, Lf4/E;->b:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lf4/c;

    iget-object v0, p0, Lf4/E;->c:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lf4/Z;

    iget-object v0, p0, Lf4/E;->d:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lf4/q;

    iget-object v0, p0, Lf4/E;->e:Lf4/W0;

    invoke-interface {v0}, Lf4/W0;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lf4/S;

    iget-object v7, p0, Lf4/E;->f:Lf4/W0;

    new-instance v0, Lf4/D;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lf4/D;-><init>(Landroid/app/Application;Lf4/c;Lf4/Z;Lf4/q;Lf4/S;Lf4/W0;)V

    return-object v0
.end method
