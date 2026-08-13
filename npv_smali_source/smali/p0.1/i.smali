.class public abstract Lp0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr/C;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    sget-object v0, Lp0/g;->a:Lp0/g;

    invoke-virtual {v0}, Lp0/g;->w()Lp0/x;

    move-result-object v1

    invoke-virtual {v1}, Lp0/c;->b()I

    move-result v1

    invoke-virtual {v0}, Lp0/g;->w()Lp0/x;

    move-result-object v2

    invoke-virtual {v2}, Lp0/c;->b()I

    move-result v2

    sget-object v3, Lp0/n;->a:Lp0/n$a;

    invoke-virtual {v3}, Lp0/n$a;->b()I

    move-result v4

    shl-int/lit8 v2, v2, 0x6

    or-int/2addr v1, v2

    shl-int/lit8 v2, v4, 0xc

    or-int v4, v1, v2

    sget-object v1, Lp0/h;->g:Lp0/h$a;

    invoke-virtual {v0}, Lp0/g;->w()Lp0/x;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp0/h$a;->c(Lp0/c;)Lp0/h;

    move-result-object v5

    invoke-virtual {v0}, Lp0/g;->w()Lp0/x;

    move-result-object v1

    invoke-virtual {v1}, Lp0/c;->b()I

    move-result v1

    invoke-virtual {v0}, Lp0/g;->t()Lp0/c;

    move-result-object v2

    invoke-virtual {v2}, Lp0/c;->b()I

    move-result v2

    invoke-virtual {v3}, Lp0/n$a;->b()I

    move-result v6

    shl-int/lit8 v2, v2, 0x6

    or-int/2addr v1, v2

    shl-int/lit8 v2, v6, 0xc

    or-int v6, v1, v2

    new-instance v7, Lp0/h;

    invoke-virtual {v0}, Lp0/g;->w()Lp0/x;

    move-result-object v1

    invoke-virtual {v0}, Lp0/g;->t()Lp0/c;

    move-result-object v2

    invoke-virtual {v3}, Lp0/n$a;->b()I

    move-result v8

    const/4 v9, 0x0

    invoke-direct {v7, v1, v2, v8, v9}, Lp0/h;-><init>(Lp0/c;Lp0/c;ILy7/k;)V

    invoke-virtual {v0}, Lp0/g;->t()Lp0/c;

    move-result-object v1

    invoke-virtual {v1}, Lp0/c;->b()I

    move-result v1

    invoke-virtual {v0}, Lp0/g;->w()Lp0/x;

    move-result-object v2

    invoke-virtual {v2}, Lp0/c;->b()I

    move-result v2

    invoke-virtual {v3}, Lp0/n$a;->b()I

    move-result v8

    shl-int/lit8 v2, v2, 0x6

    or-int/2addr v1, v2

    shl-int/lit8 v2, v8, 0xc

    or-int v8, v1, v2

    new-instance v1, Lp0/h;

    invoke-virtual {v0}, Lp0/g;->t()Lp0/c;

    move-result-object v2

    invoke-virtual {v0}, Lp0/g;->w()Lp0/x;

    move-result-object v0

    invoke-virtual {v3}, Lp0/n$a;->b()I

    move-result v3

    invoke-direct {v1, v2, v0, v3, v9}, Lp0/h;-><init>(Lp0/c;Lp0/c;ILy7/k;)V

    move-object v9, v1

    invoke-static/range {v4 .. v9}, Lr/o;->c(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Lr/C;

    move-result-object v0

    sput-object v0, Lp0/i;->a:Lr/C;

    return-void
.end method

.method public static final a()Lr/C;
    .locals 1

    sget-object v0, Lp0/i;->a:Lr/C;

    return-object v0
.end method
