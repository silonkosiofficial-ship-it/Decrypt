.class public final Landroidx/compose/animation/a$f$d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/a$f$d$a;->a(LV/N;)LV/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf0/r;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Landroidx/compose/animation/e;


# direct methods
.method public constructor <init>(Lf0/r;Ljava/lang/Object;Landroidx/compose/animation/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/a$f$d$a$a;->a:Lf0/r;

    iput-object p2, p0, Landroidx/compose/animation/a$f$d$a$a;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/compose/animation/a$f$d$a$a;->c:Landroidx/compose/animation/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/animation/a$f$d$a$a;->a:Lf0/r;

    iget-object v1, p0, Landroidx/compose/animation/a$f$d$a$a;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lf0/r;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroidx/compose/animation/a$f$d$a$a;->c:Landroidx/compose/animation/e;

    invoke-virtual {v0}, Landroidx/compose/animation/e;->i()Lr/K;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/animation/a$f$d$a$a;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lr/K;->p(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
