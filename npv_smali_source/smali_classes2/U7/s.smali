.class public final LU7/s;
.super LU7/f;
.source "SourceFile"

# interfaces
.implements Le8/o;


# instance fields
.field private final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ln8/f;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LU7/f;-><init>(Ln8/f;Ly7/k;)V

    iput-object p2, p0, LU7/s;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LU7/s;->c:Ljava/lang/Object;

    return-object v0
.end method
