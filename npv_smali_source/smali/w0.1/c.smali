.class public final Lw0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw0/b;


# instance fields
.field private final a:Lx7/l;

.field private final b:LV/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(ILx7/l;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lw0/c;->a:Lx7/l;

    invoke-static {p1}, Lw0/a;->c(I)Lw0/a;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x2

    invoke-static {p1, p2, v0, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, Lw0/c;->b:LV/w0;

    return-void
.end method

.method public synthetic constructor <init>(ILx7/l;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lw0/c;-><init>(ILx7/l;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lw0/c;->b:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw0/a;

    invoke-virtual {v0}, Lw0/a;->i()I

    move-result v0

    return v0
.end method

.method public b(I)V
    .locals 1

    iget-object v0, p0, Lw0/c;->b:LV/w0;

    invoke-static {p1}, Lw0/a;->c(I)Lw0/a;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method
