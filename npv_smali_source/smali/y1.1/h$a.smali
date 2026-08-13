.class public Ly1/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly1/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:I

.field private final b:[Ly1/h$b;


# direct methods
.method public constructor <init>(I[Ly1/h$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ly1/h$a;->a:I

    iput-object p2, p0, Ly1/h$a;->b:[Ly1/h$b;

    return-void
.end method

.method static a(I[Ly1/h$b;)Ly1/h$a;
    .locals 1

    new-instance v0, Ly1/h$a;

    invoke-direct {v0, p0, p1}, Ly1/h$a;-><init>(I[Ly1/h$b;)V

    return-object v0
.end method


# virtual methods
.method public b()[Ly1/h$b;
    .locals 1

    iget-object v0, p0, Ly1/h$a;->b:[Ly1/h$b;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Ly1/h$a;->a:I

    return v0
.end method
