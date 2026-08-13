.class public final LI4/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK4/j;


# instance fields
.field private final a:LK4/m;

.field private final b:LK4/m;


# direct methods
.method public constructor <init>(LK4/m;LK4/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI4/m;->a:LK4/m;

    iput-object p2, p0, LI4/m;->b:LK4/m;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LI4/m;->a:LK4/m;

    invoke-interface {v0}, LK4/m;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LI4/m;->b:LK4/m;

    invoke-interface {v1}, LK4/m;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LK4/x;

    new-instance v2, LI4/k;

    check-cast v0, Landroid/content/Context;

    invoke-direct {v2, v0, v1}, LI4/k;-><init>(Landroid/content/Context;LK4/x;)V

    return-object v2
.end method
