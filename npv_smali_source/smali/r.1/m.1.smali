.class public abstract Lr/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr/B;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr/B;-><init>(I)V

    sput-object v0, Lr/m;->a:Lr/l;

    return-void
.end method

.method public static final varargs a([I)Lr/l;
    .locals 2

    const-string v0, "elements"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr/B;

    array-length v1, p0

    invoke-direct {v0, v1}, Lr/B;-><init>(I)V

    invoke-virtual {v0, p0}, Lr/B;->j([I)V

    return-object v0
.end method
