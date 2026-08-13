.class public final Lx9/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# static fields
.field public static final a:Lx9/J;

.field private static final b:Lv9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lx9/J;

    invoke-direct {v0}, Lx9/J;-><init>()V

    sput-object v0, Lx9/J;->a:Lx9/J;

    new-instance v0, Lx9/q0;

    const-string v1, "kotlin.Int"

    sget-object v2, Lv9/d$f;->a:Lv9/d$f;

    invoke-direct {v0, v1, v2}, Lx9/q0;-><init>(Ljava/lang/String;Lv9/d;)V

    sput-object v0, Lx9/J;->b:Lv9/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lv9/f;
    .locals 1

    sget-object v0, Lx9/J;->b:Lv9/f;

    return-object v0
.end method

.method public bridge synthetic b(Lw9/h;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lx9/J;->f(Lw9/h;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lw9/j;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lx9/J;->g(Lw9/j;I)V

    return-void
.end method

.method public f(Lw9/h;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lw9/h;->m()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public g(Lw9/j;I)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lw9/j;->A(I)V

    return-void
.end method
