.class final Lf4/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/app/Application;


# direct methods
.method synthetic constructor <init>(Lf4/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lf4/a;
    .locals 3

    iget-object v0, p0, Lf4/j;->a:Landroid/app/Application;

    const-class v1, Landroid/app/Application;

    invoke-static {v0, v1}, Lf4/U0;->b(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lf4/h;

    iget-object v1, p0, Lf4/j;->a:Landroid/app/Application;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf4/h;-><init>(Landroid/app/Application;Lf4/g;)V

    return-object v0
.end method

.method public final b(Landroid/app/Application;)Lf4/j;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lf4/j;->a:Landroid/app/Application;

    return-object p0
.end method
