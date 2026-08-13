.class public final LZ2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/b;


# instance fields
.field private final a:Lh7/a;

.field private final b:Lh7/a;

.field private final c:Lh7/a;


# direct methods
.method public constructor <init>(Lh7/a;Lh7/a;Lh7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ2/j;->a:Lh7/a;

    iput-object p2, p0, LZ2/j;->b:Lh7/a;

    iput-object p3, p0, LZ2/j;->c:Lh7/a;

    return-void
.end method

.method public static a(Lh7/a;Lh7/a;Lh7/a;)LZ2/j;
    .locals 1

    new-instance v0, LZ2/j;

    invoke-direct {v0, p0, p1, p2}, LZ2/j;-><init>(Lh7/a;Lh7/a;Lh7/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Li3/a;Li3/a;)LZ2/i;
    .locals 1

    new-instance v0, LZ2/i;

    invoke-direct {v0, p0, p1, p2}, LZ2/i;-><init>(Landroid/content/Context;Li3/a;Li3/a;)V

    return-object v0
.end method


# virtual methods
.method public b()LZ2/i;
    .locals 3

    iget-object v0, p0, LZ2/j;->a:Lh7/a;

    invoke-interface {v0}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, LZ2/j;->b:Lh7/a;

    invoke-interface {v1}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li3/a;

    iget-object v2, p0, LZ2/j;->c:Lh7/a;

    invoke-interface {v2}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li3/a;

    invoke-static {v0, v1, v2}, LZ2/j;->c(Landroid/content/Context;Li3/a;Li3/a;)LZ2/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZ2/j;->b()LZ2/i;

    move-result-object v0

    return-object v0
.end method
