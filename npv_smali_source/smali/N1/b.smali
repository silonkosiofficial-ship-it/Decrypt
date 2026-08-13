.class public final LN1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM1/d;


# instance fields
.field private final a:Lx7/l;


# direct methods
.method public constructor <init>(Lx7/l;)V
    .locals 1

    const-string v0, "produceNewData"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN1/b;->a:Lx7/l;

    return-void
.end method


# virtual methods
.method public a(LM1/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, LN1/b;->a:Lx7/l;

    invoke-interface {p2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
