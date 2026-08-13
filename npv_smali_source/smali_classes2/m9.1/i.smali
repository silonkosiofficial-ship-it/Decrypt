.class public final Lm9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Lx7/a;


# direct methods
.method public constructor <init>(ILx7/a;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lm9/i;->a:I

    iput-object p2, p0, Lm9/i;->b:Lx7/a;

    return-void
.end method


# virtual methods
.method public final a()Lx7/a;
    .locals 1

    iget-object v0, p0, Lm9/i;->b:Lx7/a;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lm9/i;->a:I

    return v0
.end method
