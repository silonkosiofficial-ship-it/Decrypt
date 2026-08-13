.class final LI4/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI4/w;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method synthetic constructor <init>(LI4/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()LI4/v;
    .locals 3

    iget-object v0, p0, LI4/t;->a:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, LK4/l;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, LI4/v;

    iget-object v1, p0, LI4/t;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LI4/v;-><init>(Landroid/content/Context;LI4/u;)V

    return-object v0
.end method

.method public final b(Landroid/content/Context;)LI4/t;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, LI4/t;->a:Landroid/content/Context;

    return-object p0
.end method
