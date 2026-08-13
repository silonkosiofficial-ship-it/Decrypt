.class public final LZ8/t$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/t;->a(LZ8/f;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:Ly7/O;


# direct methods
.method public constructor <init>(Ly7/O;)V
    .locals 0

    iput-object p1, p0, LZ8/t$a;->C:Ly7/O;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, LZ8/t$a;->C:Ly7/O;

    iput-object p1, p2, Ly7/O;->C:Ljava/lang/Object;

    new-instance p1, La9/a;

    invoke-direct {p1, p0}, La9/a;-><init>(Ljava/lang/Object;)V

    throw p1
.end method
