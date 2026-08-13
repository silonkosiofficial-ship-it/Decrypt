.class public final LB8/A$b;
.super LB8/A;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB8/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final d:Ln8/c;


# direct methods
.method public constructor <init>(Ln8/c;Lk8/c;Lk8/g;LO7/a0;)V
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p2, p3, p4, v0}, LB8/A;-><init>(Lk8/c;Lk8/g;LO7/a0;Ly7/k;)V

    iput-object p1, p0, LB8/A$b;->d:Ln8/c;

    return-void
.end method


# virtual methods
.method public a()Ln8/c;
    .locals 1

    iget-object v0, p0, LB8/A$b;->d:Ln8/c;

    return-object v0
.end method
