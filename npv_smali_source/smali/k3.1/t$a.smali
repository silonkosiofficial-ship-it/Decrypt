.class public Lk3/t$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk3/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:Ljava/lang/String;

.field private final d:Ljava/util/List;

.field private e:Lk3/t$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lk3/t$a;->a:I

    iput v0, p0, Lk3/t$a;->b:I

    const/4 v0, 0x0

    iput-object v0, p0, Lk3/t$a;->c:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk3/t$a;->d:Ljava/util/List;

    sget-object v0, Lk3/t$b;->D:Lk3/t$b;

    iput-object v0, p0, Lk3/t$a;->e:Lk3/t$b;

    return-void
.end method


# virtual methods
.method public a()Lk3/t;
    .locals 8

    new-instance v7, Lk3/t;

    iget v1, p0, Lk3/t$a;->a:I

    iget v2, p0, Lk3/t$a;->b:I

    iget-object v3, p0, Lk3/t$a;->c:Ljava/lang/String;

    iget-object v4, p0, Lk3/t$a;->d:Ljava/util/List;

    iget-object v5, p0, Lk3/t$a;->e:Lk3/t$b;

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lk3/t;-><init>(IILjava/lang/String;Ljava/util/List;Lk3/t$b;Lk3/F;)V

    return-object v7
.end method
