.class final Lf4/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/w;


# instance fields
.field private final a:Lf4/h;

.field private b:Lf4/S;


# direct methods
.method synthetic constructor <init>(Lf4/h;Lf4/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/l;->a:Lf4/h;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lf4/S;)Lf4/w;
    .locals 0

    iput-object p1, p0, Lf4/l;->b:Lf4/S;

    return-object p0
.end method

.method public final b()Lf4/x;
    .locals 4

    iget-object v0, p0, Lf4/l;->b:Lf4/S;

    const-class v1, Lf4/S;

    invoke-static {v0, v1}, Lf4/U0;->b(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lf4/n;

    iget-object v1, p0, Lf4/l;->a:Lf4/h;

    iget-object v2, p0, Lf4/l;->b:Lf4/S;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lf4/n;-><init>(Lf4/h;Lf4/S;Lf4/m;)V

    return-object v0
.end method
