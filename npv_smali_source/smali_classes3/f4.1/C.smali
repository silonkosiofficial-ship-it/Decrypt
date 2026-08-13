.class final Lf4/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL4/f$b;
.implements LL4/f$a;


# instance fields
.field private final a:LL4/f$b;

.field private final b:LL4/f$a;


# direct methods
.method synthetic constructor <init>(LL4/f$b;LL4/f$a;Lf4/A;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/C;->a:LL4/f$b;

    iput-object p2, p0, Lf4/C;->b:LL4/f$a;

    return-void
.end method


# virtual methods
.method public final a(LL4/b;)V
    .locals 1

    iget-object v0, p0, Lf4/C;->a:LL4/f$b;

    invoke-interface {v0, p1}, LL4/f$b;->a(LL4/b;)V

    return-void
.end method

.method public final b(LL4/e;)V
    .locals 1

    iget-object v0, p0, Lf4/C;->b:LL4/f$a;

    invoke-interface {v0, p1}, LL4/f$a;->b(LL4/e;)V

    return-void
.end method
