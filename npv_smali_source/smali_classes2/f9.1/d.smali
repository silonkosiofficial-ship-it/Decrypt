.class public final synthetic Lf9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# instance fields
.field public final synthetic C:Lf9/f;

.field public final synthetic D:Lf9/f$a;


# direct methods
.method public synthetic constructor <init>(Lf9/f;Lf9/f$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf9/d;->C:Lf9/f;

    iput-object p2, p0, Lf9/d;->D:Lf9/f$a;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lf9/d;->C:Lf9/f;

    iget-object v1, p0, Lf9/d;->D:Lf9/f$a;

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Li7/M;

    check-cast p3, Lm7/i;

    invoke-static {v0, v1, p1, p2, p3}, Lf9/f$a;->a(Lf9/f;Lf9/f$a;Ljava/lang/Throwable;Li7/M;Lm7/i;)Li7/M;

    move-result-object p1

    return-object p1
.end method
