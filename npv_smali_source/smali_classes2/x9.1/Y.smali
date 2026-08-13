.class public final Lx9/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/b;


# static fields
.field public static final a:Lx9/Y;

.field private static final b:Lv9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx9/Y;

    invoke-direct {v0}, Lx9/Y;-><init>()V

    sput-object v0, Lx9/Y;->a:Lx9/Y;

    sget-object v0, Lx9/X;->a:Lx9/X;

    sput-object v0, Lx9/Y;->b:Lv9/f;

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

    sget-object v0, Lx9/Y;->b:Lv9/f;

    return-object v0
.end method

.method public bridge synthetic b(Lw9/h;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lx9/Y;->f(Lw9/h;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lw9/j;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, Lx9/Y;->g(Lw9/j;Ljava/lang/Void;)V

    return-void
.end method

.method public f(Lw9/h;)Ljava/lang/Void;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lt9/d;

    const-string v0, "\'kotlin.Nothing\' does not have instances"

    invoke-direct {p1, v0}, Lt9/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g(Lw9/j;Ljava/lang/Void;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "value"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lt9/d;

    const-string p2, "\'kotlin.Nothing\' cannot be serialized"

    invoke-direct {p1, p2}, Lt9/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method
