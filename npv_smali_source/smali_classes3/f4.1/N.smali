.class public final synthetic Lf4/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL4/f$b;


# instance fields
.field public final synthetic a:Landroid/app/Activity;

.field public final synthetic b:LL4/b$a;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;LL4/b$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/N;->a:Landroid/app/Activity;

    iput-object p2, p0, Lf4/N;->b:LL4/b$a;

    return-void
.end method


# virtual methods
.method public final a(LL4/b;)V
    .locals 2

    iget-object v0, p0, Lf4/N;->a:Landroid/app/Activity;

    iget-object v1, p0, Lf4/N;->b:LL4/b$a;

    invoke-interface {p1, v0, v1}, LL4/b;->a(Landroid/app/Activity;LL4/b$a;)V

    return-void
.end method
