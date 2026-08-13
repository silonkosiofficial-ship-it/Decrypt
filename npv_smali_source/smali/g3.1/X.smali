.class public final Lg3/X;
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

    iput-object p1, p0, Lg3/X;->a:Lh7/a;

    iput-object p2, p0, Lg3/X;->b:Lh7/a;

    iput-object p3, p0, Lg3/X;->c:Lh7/a;

    return-void
.end method

.method public static a(Lh7/a;Lh7/a;Lh7/a;)Lg3/X;
    .locals 1

    new-instance v0, Lg3/X;

    invoke-direct {v0, p0, p1, p2}, Lg3/X;-><init>(Lh7/a;Lh7/a;Lh7/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;I)Lg3/W;
    .locals 1

    new-instance v0, Lg3/W;

    invoke-direct {v0, p0, p1, p2}, Lg3/W;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public b()Lg3/W;
    .locals 3

    iget-object v0, p0, Lg3/X;->a:Lh7/a;

    invoke-interface {v0}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lg3/X;->b:Lh7/a;

    invoke-interface {v1}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lg3/X;->c:Lh7/a;

    invoke-interface {v2}, Lh7/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v0, v1, v2}, Lg3/X;->c(Landroid/content/Context;Ljava/lang/String;I)Lg3/W;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg3/X;->b()Lg3/W;

    move-result-object v0

    return-object v0
.end method
