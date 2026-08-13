.class public final LR7/o;
.super LP7/b;
.source "SourceFile"

# interfaces
.implements LO7/w;


# instance fields
.field private final D:LO7/U;


# direct methods
.method public constructor <init>(LP7/g;LO7/U;)V
    .locals 1

    const-string v0, "annotations"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "correspondingProperty"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LP7/b;-><init>(LP7/g;)V

    iput-object p2, p0, LR7/o;->D:LO7/U;

    return-void
.end method
