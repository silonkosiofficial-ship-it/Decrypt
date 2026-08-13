.class public final La9/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm7/i;


# instance fields
.field private final synthetic C:Lm7/i;

.field public final D:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;Lm7/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La9/m;->C:Lm7/i;

    iput-object p1, p0, La9/m;->D:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, La9/m;->C:Lm7/i;

    invoke-interface {v0, p1, p2}, Lm7/i;->D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i(Lm7/i$c;)Lm7/i$b;
    .locals 1

    iget-object v0, p0, La9/m;->C:Lm7/i;

    invoke-interface {v0, p1}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    return-object p1
.end method

.method public o0(Lm7/i;)Lm7/i;
    .locals 1

    iget-object v0, p0, La9/m;->C:Lm7/i;

    invoke-interface {v0, p1}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p1

    return-object p1
.end method

.method public y0(Lm7/i$c;)Lm7/i;
    .locals 1

    iget-object v0, p0, La9/m;->C:Lm7/i;

    invoke-interface {v0, p1}, Lm7/i;->y0(Lm7/i$c;)Lm7/i;

    move-result-object p1

    return-object p1
.end method
