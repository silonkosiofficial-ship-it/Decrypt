.class public final synthetic LS8/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic C:Ljava/lang/CharSequence;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS8/G;->C:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LS8/G;->C:Ljava/lang/CharSequence;

    check-cast p1, LE7/i;

    invoke-static {v0, p1}, LS8/H;->X(Ljava/lang/CharSequence;LE7/i;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
