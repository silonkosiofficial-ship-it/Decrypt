.class final LS8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR8/h;


# instance fields
.field private final a:Ljava/lang/CharSequence;

.field private final b:I

.field private final c:I

.field private final d:Lx7/p;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IILx7/p;)V
    .locals 1

    const-string v0, "input"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getNextMatch"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS8/e;->a:Ljava/lang/CharSequence;

    iput p2, p0, LS8/e;->b:I

    iput p3, p0, LS8/e;->c:I

    iput-object p4, p0, LS8/e;->d:Lx7/p;

    return-void
.end method

.method public static final synthetic b(LS8/e;)Lx7/p;
    .locals 0

    iget-object p0, p0, LS8/e;->d:Lx7/p;

    return-object p0
.end method

.method public static final synthetic c(LS8/e;)Ljava/lang/CharSequence;
    .locals 0

    iget-object p0, p0, LS8/e;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static final synthetic d(LS8/e;)I
    .locals 0

    iget p0, p0, LS8/e;->c:I

    return p0
.end method

.method public static final synthetic e(LS8/e;)I
    .locals 0

    iget p0, p0, LS8/e;->b:I

    return p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, LS8/e$a;

    invoke-direct {v0, p0}, LS8/e$a;-><init>(LS8/e;)V

    return-object v0
.end method
