.class public abstract Lm9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Integer;

.field private final b:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/e;->a:Ljava/lang/Integer;

    iput-object p2, p0, Lm9/e;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;Ljava/lang/String;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lm9/e;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;Ljava/lang/CharSequence;II)Lm9/g;
.end method

.method public b()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lm9/e;->a:Ljava/lang/Integer;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm9/e;->b:Ljava/lang/String;

    return-object v0
.end method
