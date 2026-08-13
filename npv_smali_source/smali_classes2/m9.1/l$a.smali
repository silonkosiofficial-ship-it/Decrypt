.class final Lm9/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm9/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lm9/q;

.field private final c:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lm9/q;I)V
    .locals 1

    const-string v0, "parserStructure"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/l$a;->a:Ljava/lang/Object;

    iput-object p2, p0, Lm9/l$a;->b:Lm9/q;

    iput p3, p0, Lm9/l$a;->c:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lm9/l$a;->c:I

    return v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lm9/l$a;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final c()Lm9/q;
    .locals 1

    iget-object v0, p0, Lm9/l$a;->b:Lm9/q;

    return-object v0
.end method
