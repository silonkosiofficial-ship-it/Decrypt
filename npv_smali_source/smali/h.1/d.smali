.class public final synthetic Lh/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/o;


# instance fields
.field public final synthetic C:Lh/e;

.field public final synthetic D:Ljava/lang/String;

.field public final synthetic E:Lh/b;

.field public final synthetic F:Li/a;


# direct methods
.method public synthetic constructor <init>(Lh/e;Ljava/lang/String;Lh/b;Li/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh/d;->C:Lh/e;

    iput-object p2, p0, Lh/d;->D:Ljava/lang/String;

    iput-object p3, p0, Lh/d;->E:Lh/b;

    iput-object p4, p0, Lh/d;->F:Li/a;

    return-void
.end method


# virtual methods
.method public final i(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 6

    iget-object v0, p0, Lh/d;->C:Lh/e;

    iget-object v1, p0, Lh/d;->D:Ljava/lang/String;

    iget-object v2, p0, Lh/d;->E:Lh/b;

    iget-object v3, p0, Lh/d;->F:Li/a;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lh/e;->a(Lh/e;Ljava/lang/String;Lh/b;Li/a;Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V

    return-void
.end method
